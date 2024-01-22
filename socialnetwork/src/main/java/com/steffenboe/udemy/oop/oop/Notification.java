package com.steffenboe.udemy.oop.oop;

public abstract class Notification {

    protected String content;

    protected Notification(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
