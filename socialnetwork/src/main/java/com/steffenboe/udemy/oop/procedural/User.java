package com.steffenboe.udemy.oop.procedural;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private Feed feed = new Feed();
    private List<User> followers = new ArrayList<>();
    private Map<Notification, ReadingState> notifications = new HashMap<>();

    public Feed getFeed() {
        return feed;
    }

    public void addFollower(User user) {
        followers.add(user);
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void addNotification(Notification notification) {
        notifications.put(notification, ReadingState.UNREAD);
    }

    public Map<Notification, ReadingState> getNotifications() {
        return notifications;
    }

}
