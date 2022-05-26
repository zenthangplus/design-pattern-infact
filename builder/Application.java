package builder;

public class Application {

    public static void main(String[] args) {
        Order order = OrderBuilder.make()
                .price(100)
                .quantity(1)
                .leverage(125)
                .build();
    }
}
