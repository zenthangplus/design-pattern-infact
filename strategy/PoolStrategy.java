package strategy;

public interface PoolStrategy {

    String type();

    void stake(String assetAddress);

    void unstake(String assetAddress);
}
