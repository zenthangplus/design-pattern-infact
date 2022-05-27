package state.states;

import state.Order;

public abstract class State {

    protected Order order;

    public State(Order order) {
        this.order = order;
    }

    public abstract void approve();

    public abstract void deliver();

    public abstract void cancel();
}
