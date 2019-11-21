package lab4;

import com.google.gson.Gson;
import lab4.model.User;
import lab4.model.WebSite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadFromFile {

    public static WebSite load() throws IOException {
        WebSite webSite = null;
        String websiteStr = "";
        File file = new File("website.json");

        if(file.exists()){
            websiteStr = new String(Files.readAllBytes(file.toPath()));
        }
        webSite = new Gson().fromJson(websiteStr, WebSite.class);
        return webSite;
    }

    public static List<User> loadPersonList() throws IOException {
        String pStr = "";
        File file = new File("users.json");
        if (file.exists()){
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else System.out.println("File users.json not found!");
        Gson gson = new Gson();
        User[] plst = gson.fromJson(pStr, User[].class);

        return Arrays.asList(plst);
    }
}
