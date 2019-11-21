package lab4.model;

import java.util.List;

public class Order extends User {

    private List<Advertisement> basket;

    public Order(String name, String surname, String phone_number, String birthday) {
        super(name, surname, phone_number, birthday);
    }

    public List<Advertisement> getBasket() {
        return basket;
    }

    void addItemToOrder(Advertisement item){
        basket.add(item);
    }

    void removeItemFromOrder(Advertisement item){
        basket.remove(item);
    }

    public int calculateSum(){
        int sum = 0;
        for (Advertisement item: basket){
            sum += item.getPrice();
        }
        return sum;
    }
}
