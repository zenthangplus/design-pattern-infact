package strategy;

public class BondPoolStrategy implements PoolStrategy {
    @Override
    public String type() {
        return "BOND";
    }

    @Override
    public boolean deposit(String assetAddress) {
        // Do deposit asset
        System.out.printf("Deposited asset %s into BOND\n", assetAddress);
        return false;
    }

    @Override
    public boolean withdraw(String assetAddress) {
        // Do deposit withdraw
        System.out.printf("Withdraw asset %s from BOND\n", assetAddress);
        return false;
    }
}
