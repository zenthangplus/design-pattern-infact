package state.states;

import state.Order;

public class DoneState extends State {

    public DoneState(Order order) {
        super(order);
    }

    @Override
    public void approve() {
        System.out.println("Invalid `approve` operation for DONE state");
    }

    @Override
    public void deliver() {
        System.out.println("Invalid `deliver` operation for DONE state");
    }

    @Override
    public void cancel() {
        System.out.println("Invalid `cancel` operation for DONE state");
    }
}
