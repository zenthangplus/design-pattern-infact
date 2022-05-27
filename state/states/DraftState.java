package state.states;

import state.Order;

import java.util.Objects;

public class DraftState extends State {

    public DraftState(Order order) {
        super(order);
    }

    public void approve() {
        if (this.order.getItemId() == null || Objects.equals(this.order.getItemId(), "")) {
            System.out.println("Item must not empty");
            return;
        }
        if (this.order.getQuantity() <= 0) {
            System.out.println("Quantity must greater than zero");
            return;
        }
        this.order.setState(new OpenState(this.order));
    }

    @Override
    public void deliver() {
        System.out.println("Invalid `deliver` operation for DRAFT state");
    }

    @Override
    public void cancel() {
        this.order.setState(new CancelledState(this.order));
    }
}
