package lab3;

import lab3.model.User;
import lab3.model.WebSite;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

public class MainSave {
    public static void main(String[] args) throws JAXBException {

        WebSite webSite = new WebSite();

        User user1 = new User("Oleg", "Semivrajnov", "+79049335772", "1999/23/08");
        User user2 = new User("Dany", "Baev", "+7124322552", "2001/09/09");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        webSite.setUsers(users);

        XMLService.saveWebsiteData(webSite);
    }
}
