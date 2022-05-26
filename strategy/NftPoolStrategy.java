package strategy;

public class NftPoolStrategy implements PoolStrategy {
    @Override
    public String type() {
        return "NFT";
    }

    @Override
    public boolean deposit(String assetAddress) {
        // Do deposit asset
        System.out.printf("Deposited asset %s into NFT\n", assetAddress);
        return true;
    }

    @Override
    public boolean withdraw(String assetAddress) {
        // Do withdraw asset
        System.out.printf("Withdraw asset %s from NFT\n", assetAddress);
        return true;
    }
}
