package observer.listeners;

import observer.core.Subscriber;

public class CreateWalletTrackingListener implements Subscriber {
    @Override
    public void handle(Object payload) {
        // Create tracking for this wallet
        System.out.printf("Tracking has been created for wallet %s\n", payload);
    }
}
