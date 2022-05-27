package state;

import state.states.DraftState;
import state.states.State;

public class Order {
    private State state;
    private String itemId;
    private int quantity;

    public Order() {
        // Initial state
        this.setState(new DraftState(this));
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        if (this.state == null) {
            System.out.printf("Order state initialed from %s\n", state.getClass().getSimpleName());
        } else {
            System.out.printf("Order state change from %s to %s\n",
                    this.state.getClass().getSimpleName(), state.getClass().getSimpleName());
        }
        this.state = state;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
