package lab7;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    private static Connection connection;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        HashMap<String, HashSet<String>> tables = new HashMap<>();
        Connection connection = getConnection();
        System.out.println("List of tables: ");
        List<String> tbls = getTables(connection);
        tbls.forEach(System.out::println);

    }



    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()){
            return connection;
        }
        Class.forName("org.postgresql.Driver");
        String dbURL = "jdbc:postgresql://localhost:5432/lab7";
        connection = DriverManager.getConnection( dbURL, "postgres", "vfrae0v5");

        return connection;
    }

    public static List<String> getTables(Connection connection) throws SQLException {
        List<String> tableList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT table_name FROM information_schema.tables " +
                        "WHERE table_type = 'BASE TABLE' AND" +
                        " table_schema NOT IN ('pg_catalog', 'information_schema')");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            String str = resultSet.getString("table_name");
            tableList.add(str);
        }
        preparedStatement.close();
        return tableList;
    }
}
