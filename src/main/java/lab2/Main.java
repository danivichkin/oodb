package lab2;

import lab1.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        SaveDB.cleanUserList();

        ArrayList<User> users = addUsers();

        SaveDB.saveUserList(users);

        Scanner in = new Scanner(System.in);
        System.out.println("Search by: 1: name, 2: surname, 3: phone");
        int searchSetting = in.nextInt();
        switch (searchSetting){
            case 1:
                System.out.println("Input name: ");
                String name = in.next();
                UserService.findUserByName(users, name);
                    break;
            case 2:
                System.out.println("Input surname: ");
                String surname = in.next();
                UserService.findUserBySurname(users, surname);
                    break;
            case 3:
                System.out.println("Input phone: ");
                String phone = in.next();
                UserService.findUserByPhoneNumber(users, phone);
                     break;
        }

        User user = UserService.findUserByName(users, "Edik");

        if (user != null){
            user.setName("Edik");
            user.setSurname("Tolkachev");
            user.setPhone_number("2385727384");
            user.setBirthday("None");
            users.add(user);
        }
        SaveDB.saveUserList(users);
    }

    private static ArrayList<User> addUsers(){
        User userOleg = new User("Oleg", "Semivrajnov", "+79049335772", "1999/23/08");
        User userDany = new User("Dany", "Baev", "+7124322552", "2001/09/09");
        ArrayList<User> users = new ArrayList<User>();
        users.add(userDany);
        users.add(userOleg);
        return users;
    }

}
