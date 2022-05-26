package strategy;

public class NftPoolStrategy implements PoolStrategy {
    @Override
    public String type() {
        return "NFT";
    }

    @Override
    public boolean deposit(String assetAddress) {
        // Do deposit asset
        return true;
    }

    @Override
    public boolean withdraw(String assetAddress) {
        // Do withdraw asset
        return true;
    }
}
