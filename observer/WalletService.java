package observer;

import observer.core.Publisher;

public class WalletService {

    public final Publisher publisher;

    public WalletService(Publisher publisher) {
        this.publisher = publisher;
    }

    public void create() {
        String walletId = "sample-wallet-id";// Do create and get wallet id
        System.out.printf("Wallet created with id %s\n", walletId);
        publisher.publish("wallet.created", walletId);
    }
}
