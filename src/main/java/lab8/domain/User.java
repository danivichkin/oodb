package lab8.domain;

import lab7.annotation.Column;
import lombok.Data;

@Data
public class User {
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String phoneNumber;
    @Column
    private String email;

}
