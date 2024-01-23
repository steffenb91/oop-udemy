package com.steffenboe.udemy.oop;

import org.junit.jupiter.api.Test;

import com.steffenboe.udemy.oop.oop.Feed;
import com.steffenboe.udemy.oop.oop.OnNewPostNotification;
import com.steffenboe.udemy.oop.oop.Post;
import com.steffenboe.udemy.oop.oop.User;

public class PostTest {
    
    @Test
    void shouldPost(){
        Feed feed = new Feed();
        User user1 = new User(feed);
        Feed feed2 = new Feed();
        User user2 = new User(feed2);
        user1.follow(user2);
        user1.enable(OnNewPostNotification.class);
        feed2.publish(new Post(user2, "Hello World!"));
        feed2.publish(new Post(user2, "Hello World again!"));
        user1.printFeed();
        user2.printFeed();
    }
}
