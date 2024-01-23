package com.steffenboe.udemy.oop.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class User {

    private Feed feed;
    private Map<Notification, ReadingState> notifications = new HashMap<>();
    // filter
    private List<Class<? extends Notification>> enabledNotificationTypes = new ArrayList<>();

    public User(Feed feed) {
        this.feed = feed;
    }

    public void follow(User other) {
        other.feed.register(this);
    }

    public void onNewPost(Post post) {
        feed.addPost(post);
        addNotification(new OnNewPostNotification("Someone you followed posted a new post!"));
    }

    public void readNotifications() {
        for (Entry<Notification, ReadingState> entry : notifications.entrySet()) {
            System.out.println(String.format("Notification for user %s: %s", this, entry.getKey().getContent()));
            entry.setValue(ReadingState.READ);
        }
    }

    public void addNotification(Notification notification) {
        if (enabledNotificationTypes.contains(notification.getClass())) {
            notifications.put(notification, ReadingState.UNREAD);
            System.out.println(notification.getContent());
        }
    }

    public void enable(Class<? extends Notification> enable) {
        enabledNotificationTypes.add(enable);
    }

    public void printFeed() {
        System.out.println("User " + this + ": " + feed);
    }

}
