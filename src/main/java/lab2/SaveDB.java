package lab2;

import com.google.gson.Gson;
import lab1.User;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class SaveDB {
    public static void saveUserList(List<User> users) throws IOException {
        if (users != null && users.size() > 0){
            Gson gson = new Gson();
            String userAsJson = gson.toJson(users);
        try (OutputStream outputStream = new FileOutputStream(new File("website.json"))){
            outputStream.write(userAsJson.getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
            }
        }
    }

    public static void cleanUserList() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("website.json");
    }

}
