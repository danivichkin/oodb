package lab2;

import lab1.User;

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

}
