package strategy;


import java.util.List;

public class Application {

    public static void main(String[] args) {
        // For real-world application, you should implement DI
        NftPoolStrategy nftPoolStrategy = new NftPoolStrategy();
        BondPoolStrategy bondPoolStrategy = new BondPoolStrategy();
        PoolResolver poolResolver = new PoolResolver(List.of(nftPoolStrategy, bondPoolStrategy));

        // Now you can use strategy's key to resolve its implementation
        PoolStrategy poolStrategy = poolResolver.resolve("BOND");
        poolStrategy.deposit("TEST_ASSET");
        poolStrategy.withdraw("TEST_ASSET");
    }
}
