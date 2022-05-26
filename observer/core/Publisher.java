package observer.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {

    private final Map<String, List<Subscriber>> subscriberMap = new HashMap<>();

    public void subscribe(String event, Subscriber subscriber) {
        if (!subscriberMap.containsKey(event)) {
            subscriberMap.put(event, new ArrayList<>());
        }
        subscriberMap.get(event).add(subscriber);
    }

    public void publish(String event, Object payload) {
        List<Subscriber> subscribers = subscriberMap.get(event);
        if (subscribers == null || subscribers.size() <= 0) {
            return;
        }
        subscribers.forEach(subscriber -> subscriber.handle(payload));
    }
}
