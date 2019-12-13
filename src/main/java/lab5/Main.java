package lab5;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.time.LocalDate;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, SQLException,
            ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {

        PreparedStatement preparedStatement;
        Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
        Connection conn = setConnection();
        Statement statement = conn.createStatement();
        //Adding users
        Person person = new Person("Dany", "Baev", "Mid", "m", Date.valueOf(LocalDate.now()));
        String sql = "INSERT INTO library_person (client)  VALUES (row(?,?,?,?,?))";

        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, person.getFirstName());
        preparedStatement.setString(2, person.getSecondName());
        preparedStatement.setString(3, person.getMiddleName());
        preparedStatement.setString(4, person.getGender());
        preparedStatement.setDate(5, person.getBirthday());

        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    private static Connection setConnection() throws SQLException, IOException {

        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get("src/main/java/lab5/database.properties"))){
            props.load(in);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        return DriverManager.getConnection(url, username, password);
    }

}
