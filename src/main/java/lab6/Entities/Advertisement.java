package lab6.Entities;

import lab6.Annotations.Column;
import lab6.Annotations.Entity;

@Entity(name = "Adv")
public class Advertisement {

    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "amount")
    private int amount;

    public Advertisement(int id, String description, int price, int amount) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}