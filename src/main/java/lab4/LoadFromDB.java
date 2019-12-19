package lab4;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import lab4.model.User;
import lab4.model.WebSite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class LoadFromDB {

    public static WebSite load() throws IOException {
        WebSite webSite = null;
        String websiteStr = "";
        File file = new File("website.json");

        if (file.exists()) {
            websiteStr = new String(Files.readAllBytes(file.toPath()));
        }
        webSite = new Gson().fromJson(websiteStr, WebSite.class);
        return webSite;
    }

    //json
    public static List<User> loadPersonList(Connection connection) throws JsonSyntaxException, SQLException {
        String pStr = "";

        PreparedStatement statement =
                connection.prepareStatement("select json from oodb ");

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("json");
            System.out.println(pStr);
        }

        statement.close();

        Gson gson = new Gson();

        User[] plst = gson.fromJson(pStr, User[].class);


        statement =
                connection.prepareStatement("select json->0 as c from oodb ");

        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("c");
            System.out.println(pStr);
        }

        return Arrays.asList(plst);
    }

    public static void timeOf(){

    }
}


