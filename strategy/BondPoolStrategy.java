package strategy;

public class BondPoolStrategy implements PoolStrategy {
    @Override
    public String type() {
        return "BOND";
    }

    @Override
    public boolean deposit(String assetAddress) {
        // Do deposit asset
        return false;
    }

    @Override
    public boolean withdraw(String assetAddress) {
        // Do deposit withdraw
        return false;
    }
}
