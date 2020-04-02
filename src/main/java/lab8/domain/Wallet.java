package lab8.domain;

import lab7.annotation.Column;
import lab7.annotation.Entity;
import lab7.annotation.Id;
import lombok.Data;

@Entity
@Data
public class Wallet {

    @Column
    @Id
    private long id;
    @Column
    private String numberOfCreditCard;
    @Column
    private String dateOfCreditCard;
    @Column
    private String cardGolderName;
}
