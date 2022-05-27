package builder;

public class Application {

    public static void main(String[] args) {
        OrderBuilder builder = OrderBuilder.make()
                .price(100)
                .quantity(1)
                .leverage(125);
        builder.increaseQuantity(2);
        Order order = builder.build();
        System.out.printf("Order price: %f, quantity: %f, leverage: %d",
                order.getPrice(), order.getQuantity(), order.getLeverage());
    }
}
