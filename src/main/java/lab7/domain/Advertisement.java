package lab7.domain;

import lab7.annotation.Column;
import lab7.annotation.Id;
import lombok.Data;

@Data
public class Advertisement {

    @Id
    private long id;
    @Column
    private String name;
    @Column
    private int price;
    @Column
    private String description;
    @Column
    private int amount;
}
