package com.steffenboe.udemy.oop.oop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class User {

    private Feed feed = new Feed();
    private Set<User> followers = new HashSet<>();
    private Map<Notification, ReadingState> notifications = new HashMap<>();
    private Set<NotificationType> enabledNotificationTypes = new HashSet<>();

    public void postNew(String content) {
        Post newPost = new Post(this, content);
        feed.add(newPost);
        notifyFollowers(newPost);
    }

    private void notifyFollowers(Post newPost) {
        for (User follower : followers) {
            follower.feed.add(newPost);
            follower.addNotification(
                    new Notification(String.format("User %s published a new post!", this)));
        }
    }

    public void follow(User other) {
        other.followers.add(this);
    }

    public void readNotifications() {
        for (Entry<Notification, ReadingState> entry : notifications.entrySet()) {
            System.out.println(String.format("Notification for user %s: %s", this, entry.getKey().getContent()));
            entry.setValue(ReadingState.READ);
        }
    }

    public void addNotification(Notification notification) {
        if(enabledNotificationTypes.contains(notification.type())){
            notifications.put(notification, ReadingState.UNREAD);
        }
    }

    public void addNotificationType(NotificationType type){
        enabledNotificationTypes.add(type);
    }

}
