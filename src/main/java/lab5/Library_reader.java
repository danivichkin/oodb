package lab5;

import java.sql.Date;

public class Library_reader {
    private Person reader;
    private String abonementNumber;
    private Date date;

    public Library_reader(Person reader, String abonementNumber, Date date) {
        this.reader = reader;
        this.abonementNumber = abonementNumber;
        this.date = date;
    }

    public Library_reader() {}

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String getAbonementNumber() {
        return abonementNumber;
    }

    public void setAbonementNumber(String abonementNumber) {
        this.abonementNumber = abonementNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
