package lab5;

import java.sql.Date;

public class Person {
    private String firstName;
    private String secondName;
    private String middleName;
    private String gender = null;
    private Date birthday;

    public Person(String firstName, String secondName, String middleName, String gender, Date birthday) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthday = birthday;
    }


    public Person(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
