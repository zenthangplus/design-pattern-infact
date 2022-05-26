package builder;

public class OrderBuilder {

    private final Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public static OrderBuilder make() {
        return new OrderBuilder();
    }

    public OrderBuilder price(float price) {
        this.order.setPrice(price);
        return this;
    }

    public OrderBuilder quantity(float quantity) {
        this.order.setQuantity(quantity);
        return this;
    }

    public OrderBuilder leverage(int leverage) {
        this.order.setLeverage(leverage);
        return this;
    }

    public Order build() {
        return this.order;
    }
}
