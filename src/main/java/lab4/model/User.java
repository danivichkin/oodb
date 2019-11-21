package lab4.model;

public class User{
    private String name;
    private String surname;
    private String phone_number;
    private String birthday;

    public User(String name, String surname, String phone_number, String birthday) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.birthday = birthday;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User data: " +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", phone_number = '" + phone_number + '\'' +
                ", birthday =' " + birthday + '\'';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getBirthday() {
        return birthday;
    }
}
