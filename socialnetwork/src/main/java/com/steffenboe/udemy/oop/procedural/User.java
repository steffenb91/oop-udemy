package com.steffenboe.udemy.oop.procedural;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private Feed feed = new Feed();
    // Iteration II
    private List<User> followers = new ArrayList<>();
    // Iteration III
    private Map<Notification, ReadingState> notifications = new HashMap<>();

    public Feed getFeed() {
        return feed;
    }

    // Iteration II
    public void addFollower(User user) {
        followers.add(user);
    }

    // Iteration II
    public List<User> getFollowers() {
        return followers;
    }

    // Iteration III
    public void addNotification(Notification notification) {
        notifications.put(notification, ReadingState.UNREAD);
    }

    public Map<Notification, ReadingState> getNotifications() {
        return notifications;
    }

}
