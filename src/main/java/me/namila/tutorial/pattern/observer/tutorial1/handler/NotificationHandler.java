package me.namila.tutorial.pattern.observer.tutorial1.handler;

import me.namila.tutorial.pattern.observer.tutorial1.constant.Types;
import me.namila.tutorial.pattern.observer.tutorial1.publisher.NotificationPublisher;
import me.namila.tutorial.pattern.observer.tutorial1.subscriber.BaseSubscriber;

public class NotificationHandler {
    private NotificationPublisher notificationPublisher;

    public NotificationHandler() {
        this.notificationPublisher = new NotificationPublisher();
    }

    public void addNotificationSubscriber(Types type, BaseSubscriber baseSubscriber) {
        this.notificationPublisher.addSubscriber(type, baseSubscriber);
    }

    public void removeNotificationSubscriber(Types type, int id) {
        this.notificationPublisher.removeSubscriber(type, id);

    }

    public void openNewPage() {
        System.out.println("opening");
        this.notificationPublisher.update("Opening page for all");
    }

    public void movingSms() {
        System.out.println("Sms");
        this.notificationPublisher.update(Types.SMS, "This is for sms");
    }

    public void movingEmail() {
        System.out.println("Email");
        this.notificationPublisher.update(Types.EMAIL, "This is for Email");
    }

}
