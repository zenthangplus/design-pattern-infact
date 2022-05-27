package state.states;

import state.Order;

public class OpenState extends State {

    public OpenState(Order order) {
        super(order);
    }

    @Override
    public void approve() {
        System.out.println("Invalid `approve` operation for OPEN state");
    }

    public void deliver() {
        this.order.setState(new DoneState(this.order));
    }

    public void cancel() {
        this.order.setState(new CancelledState(this.order));
    }
}
