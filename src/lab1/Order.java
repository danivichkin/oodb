package lab1;

import java.util.List;

public class Order {
    private int id;
    private List<Advertisement> basket;

    public int getId() {
        return id;
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
