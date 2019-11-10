package lab2;

import com.google.gson.Gson;
import lab1.User;
import lab1.WebSite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadDB {

    public static WebSite load() throws IOException{
        WebSite webSite = null;
        String userStr = "";
        File file = new File("WebSite.json");

        if (file.exists()){
            userStr = new String(Files.readAllBytes(file.toPath()));
        }
        webSite = new Gson().fromJson(userStr, WebSite.class);
        return webSite;
    }

    public static List<User> loadUserList() throws IOException {

        String pStr = "";
        File file = new File("website.json");

        if (file.exists()){
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File website.json not found!");
        }

        Gson gson = new Gson();
        User[] plst = gson.fromJson(pStr, User[].class);

        return Arrays.asList(plst);

    }
}
