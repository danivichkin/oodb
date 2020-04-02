package lab8;

import lab7.annotation.Column;
import lab8.domain.Client;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ExamplePersistEntity {

    private Connection connection;

    private Properties properties;

    public ExamplePersistEntity(Properties properties) {
        this.properties = properties;
        getConnection();
    }

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("url","jdbc:postgresql://localhost:5432/lab7");
        properties.setProperty("username", "postgres");
        properties.setProperty("password", "vfrae0v5");

        ExamplePersistEntity epe = new ExamplePersistEntity(properties);

        Client client = new Client();
        epe.persist(client);

        epe.close();
    }

    public void persist(Object var){
        int p = var.getClass().getName().lastIndexOf(".");
        int l = var.getClass().getName().length();
        String tableName = var.getClass().getName().substring(p+1, l).toLowerCase();

        System.out.println(tableName);

        Field[] fields = var.getClass().getDeclaredFields();
        for(Field field: fields){
            Annotation[] annotations = field.getAnnotations();
            for(Annotation annotation: annotations){
                if(annotation.annotationType().equals(Column.class)){
                    try {
                        Method method = var.getClass().getMethod("get"+field.getName()
                                .substring(0,1).toUpperCase()+field.getName().substring(1), null);

                        System.out.println(method.getName());
                        String value = (String) method.invoke(var, null);

                        System.out.println(value);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    System.out.println(field.getName());
                }
            }
        }
    }
    public Connection getConnection(){
        if (connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                connection = DriverManager.getConnection(properties.getProperty("url"),
                        properties.getProperty("username"), properties.getProperty("password"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void close(){
        closeConnection();
    }

    public void closeConnection(){
        try {
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
