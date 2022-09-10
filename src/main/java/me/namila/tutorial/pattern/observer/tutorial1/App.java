package me.namila.tutorial.pattern.observer.tutorial1;

import me.namila.tutorial.pattern.observer.tutorial1.constant.Types;
import me.namila.tutorial.pattern.observer.tutorial1.handler.NotificationHandler;
import me.namila.tutorial.pattern.observer.tutorial1.subscriber.AndroidSubscriber;
import me.namila.tutorial.pattern.observer.tutorial1.subscriber.BaseSubscriber;
import me.namila.tutorial.pattern.observer.tutorial1.subscriber.EmailSubscriber;
import me.namila.tutorial.pattern.observer.tutorial1.subscriber.SmsSubscriber;

public class App {

    public static void main(String[] args) {

        BaseSubscriber sms1 = new SmsSubscriber(1);
        BaseSubscriber sms2 = new SmsSubscriber(2);
        BaseSubscriber sms3 = new SmsSubscriber(3);
        BaseSubscriber email1 = new EmailSubscriber(1);
        BaseSubscriber a1 = new AndroidSubscriber(1);

        NotificationHandler notificationHandler = new NotificationHandler();
        notificationHandler.addNotificationSubscriber(Types.SMS,sms1);
        notificationHandler.addNotificationSubscriber(Types.SMS,sms2);
        notificationHandler.addNotificationSubscriber(Types.SMS,sms3);
        notificationHandler.addNotificationSubscriber(Types.EMAIL,email1);
        notificationHandler.addNotificationSubscriber(Types.ANDROID,a1);

        notificationHandler.openNewPage();
        notificationHandler.movingSms();
        
        notificationHandler.removeNotificationSubscriber(Types.SMS,2);
        notificationHandler.removeNotificationSubscriber(Types.ANDROID,1);
        notificationHandler.openNewPage();
        notificationHandler.movingSms();
    }
}
