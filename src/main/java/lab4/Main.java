package lab4;

import lab4.model.User;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
        Connection connection = setConnection();

        UserService userService = new UserService();
        List<User> users = LoadFromFile.loadPersonList();

        SaveDB.saveUserList(users, connection);
       // UserService.findUserByName(20, connection);
        connection.close();

    }

    private static Connection setConnection() throws SQLException, IOException {

        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get("src/main/java/lab4/database.properties"))){
            props.load(in);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        return DriverManager.getConnection(url, username, password);
    }


}
