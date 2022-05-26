package strategy;

public interface PoolStrategy {

    String type();

    boolean deposit(String assetAddress);

    boolean withdraw(String assetAddress);
}
