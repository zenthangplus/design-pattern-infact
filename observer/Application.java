package observer;

import observer.core.Publisher;
import observer.listeners.CreateWalletTrackingListener;
import observer.listeners.SendWalletCreationBonusListener;

public class Application {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.subscribe("wallet.created", new CreateWalletTrackingListener());
        publisher.subscribe("wallet.created", new SendWalletCreationBonusListener());

        WalletService walletService = new WalletService(publisher);
        walletService.create();
    }
}
