package lab1;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String surname;
    private int phone_number;
    private Date birthday;

    public User(int id, String name, String surname, int phone_number, Date birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.birthday = birthday;
    }
}
