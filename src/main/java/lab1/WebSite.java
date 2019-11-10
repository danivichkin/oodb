package lab1;

import java.util.List;

public class WebSite {
    private String name;

    public static List<User> users;
    public static List<Advertisement> advertisements;
    public static List<Order> orders;
    public static List<PaymentData> wallet;

    public WebSite(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
