package lab8;

import java.sql.Connection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class EntityManagerFactory {

    private Connection connection;

    private Properties properties;

    //Data structure
    private HashMap<String, HashSet<String>> tables = new HashMap<>();

    public EntityManagerFactory(Properties properties){
        this.properties = properties;
    }

    public  EntityManager createEntityManager(){
        return null;
    }

    private Connection getConnection(){
        return null;
    }

    private boolean scanDB(){
        return true;
    }

}
