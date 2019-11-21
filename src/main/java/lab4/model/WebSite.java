package lab4.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Website")
@XmlAccessorType(XmlAccessType.NONE)
public class WebSite {

    private String name;
    private static List<User> users;
    private static List<Advertisement> advertisements;
    private static List<Order> orders;
    private static List<PaymentData> wallet;

    @XmlElementWrapper(name = "Users")
    @XmlElement(name = "user")
    private List<User> getUsers() {
        return users;
    }

    public WebSite(String name) {
        this.name = name;
    }

    public WebSite() { }

    public void setUsers(List<User> users) {
        WebSite.users = users;
    }

    private List<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public static List<PaymentData> getWallet() {
        return wallet;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                '}';
    }
}

