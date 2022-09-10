package me.namila.tutorial.pattern.observer.tutorial1.publisher;

import me.namila.tutorial.pattern.observer.tutorial1.constant.Types;
import me.namila.tutorial.pattern.observer.tutorial1.subscriber.BaseSubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class BasePublisher {
    private HashMap<Types, List<BaseSubscriber>> subscriberHashMap;

    public BasePublisher() {
        subscriberHashMap = new HashMap<>();
    }

    public void addSubscriber(Types type, BaseSubscriber subscriber) {
        List<BaseSubscriber> baseSubscriberList = subscriberHashMap.putIfAbsent(type, new ArrayList<BaseSubscriber>());
        if (baseSubscriberList == null) baseSubscriberList = subscriberHashMap.get(type);
        baseSubscriberList.add(subscriber);
    }

    public boolean removeSubscriber(Types type, int id) {
        if (!subscriberHashMap.containsKey(type)) return false;
        return subscriberHashMap.get(type).removeIf(subscriber -> subscriber.getId() == id);
    }

    public abstract void update(Types type, String msg);

    public abstract void update(String msg);

    protected HashMap<Types, List<BaseSubscriber>> getSubscriberHashMap() {
        return subscriberHashMap;
    }
}
