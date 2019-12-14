package lab4;

import lab4.model.User;

import java.util.List;

class UserService {

    static User findUserByName(List<User> users, String searchName){
        User result = null;
        for (User user: users){
            if (user.getName().equals(searchName)){
                result = user;
            }
        }
        return result;
    }
}
