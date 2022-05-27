package strategy;

public class BondPoolStrategy implements PoolStrategy {
    @Override
    public String type() {
        return "BOND";
    }

    @Override
    public void stake(String assetAddress) {
        // Do stake asset
        System.out.printf("Staked asset %s into BOND\n", assetAddress);
    }

    @Override
    public void unstake(String assetAddress) {
        // Do un-stake asset
        System.out.printf("Unstaked asset %s from BOND\n", assetAddress);
    }
}
