package lab3.model;

public class PaymentData {
    private int orderId;
    private User user;
    private Order order;
    private Advertisement item;
    private int totalPrice;

    public PaymentData(int orderId, User user, Order order, Advertisement advertisement, int totalPrice) {
        this.orderId = orderId;
        this.user = user;
        this.order = order;
        this.item = advertisement;
        this.totalPrice = totalPrice;
    }

    public void addItemToCart(Advertisement item){
        order.addItemToOrder(item);
        calculatePrice();
    }

    public void removeItemFromCart(Advertisement item){
        order.removeItemFromOrder(item);
        calculatePrice();
    }

    private void calculatePrice(){
        totalPrice = order.calculateSum();
    }

}
