package com.steffenboe.udemy.oop.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class User {

    private Feed feed = new Feed();
    private Set<User> followers = new HashSet<>();
    private Map<Notification, ReadingState> notifications = new HashMap<>();
    // filter
    private List<Notification> enabledNotificationTypes = new ArrayList<>();

    public void createPost(String content) {
        Post newPost = new Post(this, content);
        feed.add(newPost);
        notifyFollowers(newPost);
    }

    private void notifyFollowers(Post newPost) {
        for (User follower : followers) {
            follower.feed.add(newPost);
            follower.addNotification(new OnNewPostNotification(this));
        }
    }

    public void follow(User other) {
        other.followers.add(this);
    }

    public void handleNotifications() {
        for (Entry<Notification, ReadingState> entry : notifications.entrySet()) {
            entry.getKey().handle();
            entry.setValue(ReadingState.READ);
        }
    }

    public void addNotification(Notification notification) {
        if (enabledNotificationTypes.stream().anyMatch(n -> n.hasSameType(notification))) {
            notifications.put(notification, ReadingState.UNREAD);
        }
    }

    public void enable(Notification notification) {
        enabledNotificationTypes.add(notification);
    }

}
