package lab6.Entities;

import lab6.Annotations.Column;
import lab6.Annotations.Entity;

import java.util.List;

@Entity(name = "Website")
public class WebSite {

    @Column(name = "name")
    private String name;

    @Column
    public static List<User> users;
    @Column
    public static List<Advertisement> advertisements;
    @Column
    public static List<Order> orders;
    @Column
    public static List<PaymentData> wallet;

    public WebSite(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
