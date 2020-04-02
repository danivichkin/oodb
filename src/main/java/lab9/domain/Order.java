package lab9.domain;


import lab7.annotation.Entity;
import lab7.annotation.Id;
import lab7.annotation.ManyToMany;

import java.util.List;

@Entity
public class Order {

    @Id
    private long id;
    @ManyToMany
    private List<Advertisement> bin;

}
