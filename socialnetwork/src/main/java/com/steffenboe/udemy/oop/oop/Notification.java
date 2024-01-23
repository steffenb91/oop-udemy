package com.steffenboe.udemy.oop.oop;

public class Notification {

    private String content;
    private NotificationType type;

    public Notification(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public NotificationType type() {
        return type;
    }

}
