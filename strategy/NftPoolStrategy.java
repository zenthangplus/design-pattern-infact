package strategy;

public class NftPoolStrategy implements PoolStrategy {
    @Override
    public String type() {
        return "NFT";
    }

    @Override
    public void stake(String assetAddress) {
        // Do deposit asset
        System.out.printf("Staked asset %s into NFT\n", assetAddress);
    }

    @Override
    public void unstake(String assetAddress) {
        // Do withdraw asset
        System.out.printf("Unstaked asset %s from NFT\n", assetAddress);
    }
}
