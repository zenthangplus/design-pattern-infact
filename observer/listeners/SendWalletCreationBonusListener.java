package observer.listeners;

import observer.core.Subscriber;

public class SendWalletCreationBonusListener implements Subscriber {
    @Override
    public void handle(Object payload) {
        // Do bonus user after registration
        System.out.printf("Bonus has been sent to %s\n", payload);
    }
}
