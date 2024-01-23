package com.steffenboe.udemy.oop.oop;

public class OnNewPostNotification implements Notification {

    private User user;

    public OnNewPostNotification(User user) {
        this.user = user;
    }

    @Override
    public void handle() {
        System.out.println(String.format("New Post from %s", user));
    }

    @Override
    public boolean hasSameType(Notification other) {
        return other.getClass().equals(getClass());
    }

}
