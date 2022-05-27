package state;

public class Application {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("=========== Test order 1 ============");
        System.out.println("=====================================");
        Order order1 = new Order();

        System.out.println("\n+ Test approve an empty order +");
        order1.getState().approve();

        System.out.println("\n+ Test deliver a drafting order +");
        order1.setItemId("ID1");
        order1.setQuantity(1);
        order1.getState().deliver();

        System.out.println("\n+ Test cancel a drafting order +");
        order1.getState().cancel();

        System.out.println();
        System.out.println("=====================================");
        System.out.println("=========== Test order 2 ============");
        System.out.println("=====================================");
        Order order2 = new Order();
        order2.setItemId("ID2");
        order2.setQuantity(1);

        System.out.println("\n+ Test approve a fully order +");
        order2.getState().approve();

        System.out.println("\n+ Test deliver an approved order +");
        order2.getState().deliver();

        System.out.println("\n+ Test cancel a done order +");
        order2.getState().cancel();
    }
}
