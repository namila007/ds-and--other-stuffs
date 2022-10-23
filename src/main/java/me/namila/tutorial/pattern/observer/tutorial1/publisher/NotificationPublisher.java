package me.namila.tutorial.pattern.observer.tutorial1.publisher;

import me.namila.tutorial.pattern.observer.tutorial1.constant.Types;

public class NotificationPublisher extends BasePublisher{
    public NotificationPublisher(){

    }

    @Override
    public void update(Types type, String msg) {
        this.getSubscriberHashMap().get(type).forEach(o->o.update(msg));
    }
    @Override
    public void update(String msg) {
        this.getSubscriberHashMap().values().parallelStream().forEach(o->o.forEach(i->i.update(msg)));
    }
}
