package strategy;


import java.util.List;

public class Application {

    public static void main(String[] args) {
        // For real-world application, you should implement DI
        NftPoolStrategy nftPoolStrategy = new NftPoolStrategy();
        BondPoolStrategy bondPoolStrategy = new BondPoolStrategy();
        PoolResolver poolResolver = new PoolResolver(List.of(nftPoolStrategy, bondPoolStrategy));

        // Now you can use strategy's key to resolve its implementation
        PoolStrategy poolStrategy1 = poolResolver.resolve("BOND");
        poolStrategy1.stake("TEST_ASSET_1");
        poolStrategy1.unstake("TEST_ASSET_1");

        PoolStrategy poolStrategy2 = poolResolver.resolve("NFT");
        poolStrategy2.stake("TEST_ASSET_2");
        poolStrategy2.unstake("TEST_ASSET_2");
    }
}
