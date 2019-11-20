package lab2;

import com.google.gson.internal.$Gson$Preconditions;
import lab1.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserService {

    public static User findUserByName(List<User> users, String searchName){
        User result = null;

        for (User user: users){
            if (user.getName().equals(searchName)){
                result = user;
                System.out.println("User " + user.getName() + " was found");
                System.out.println(result.toString());
            } else { System.out.println("User does not exist"); }
        }
        return result;
    }

    public static User findUserBySurname(List<User> users, String surname){
        User result = null;

        for (User user: users){
            if (user.getSurname().equals(surname)){
                result = user;
                System.out.println("User " + user.getSurname() + " was found");
                System.out.println(result.toString());
            } else { System.out.println("User does not exist"); }
        }
        return result;
    }

    public static User findUserByPhoneNumber(List<User> users, String phoneNumber){
        User result = null;

        for (User user: users){
            if (user.getSurname().equals(phoneNumber)){
                result = user;
                System.out.println("User was found by number" + user.getPhone_number());
                System.out.println(result.toString());
            } else { System.out.println("User does not exist"); }
        }
        return result;
    }

    public static void sortUsersByLengthOfName() throws IOException {
        List<User> users = LoadDB.loadUserList();
        List<String> sortedUsers = new ArrayList<>();
        System.out.println("Names was printed by length");
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            sortedUsers.add(user.getName());
        }
        Collections.sort(sortedUsers, Collections.reverseOrder());
        System.out.println(sortedUsers);
    }

}

