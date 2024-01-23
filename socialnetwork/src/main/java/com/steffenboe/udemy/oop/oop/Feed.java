package com.steffenboe.udemy.oop.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Feed {

    private List<Post> posts = new ArrayList<>();
    private List<User> subscribers = new ArrayList<>();

    public void publish(Post post) {
        posts.add(post);
        for (User subscriber : subscribers) {
            subscriber.onNewPost(post);
        }
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void register(User feed) {
        subscribers.add(feed);
    }

    @Override
    public String toString() {
        return posts.stream().map(Post::content).collect(Collectors.joining(", "));
    }

}
