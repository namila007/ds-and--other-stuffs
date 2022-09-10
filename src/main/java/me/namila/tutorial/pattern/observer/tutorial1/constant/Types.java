package me.namila.tutorial.pattern.observer.tutorial1.constant;

public enum Types {
    SMS("sms"), EMAIL("email"), ANDROID("android");
    private String type;

    Types(String type) {
        this.type = type;
    }
}
