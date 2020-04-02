package lab9.domain;

import lab7.annotation.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Client extends User {

    @Id
    private long id;

    @Column
    @OneToOne
    private Wallet wallet;

    @Column
    @OneToMany
    private List<Order> orders;


}
