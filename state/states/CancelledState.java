package state.states;

import state.Order;

public class CancelledState extends State {

    public CancelledState(Order order) {
        super(order);
    }

    @Override
    public void approve() {
        System.out.println("Invalid `approve` operation for CANCEL state");
    }

    @Override
    public void deliver() {
        System.out.println("Invalid `deliver` operation for CANCEL state");
    }

    @Override
    public void cancel() {
        System.out.println("Invalid `cancel` operation for CANCEL state");
    }
}
