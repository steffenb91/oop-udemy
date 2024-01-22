package com.steffenboe.udemy.oop.procedural;

import java.util.List;
import java.util.Map.Entry;

/**
 * Service zum Posten von Posts
 */
public class UserPostService {

    /**
     * Creates a new post for a given user.
     * 
     * @param user    user who should post the text
     * @param content content to post in the user´s feed
     */
    void createPost(User user, String content) {
        Post newPost = new Post(user, content);
        Feed feed = user.getFeed();
        feed.add(newPost);
        // Iteration II
        List<User> followers = user.getFollowers();
        for (User follower : followers) {
            follower.getFeed().add(newPost);
            // Iteration III
            follower.addNotification(
                    new Notification(String.format("User %s published a new post!", user)));
        }
    }

    void commentPost(User commenter, Post post, String content) {
        post.addComment(new Comment(commenter, content));
        User creator = post.getCreator();
        String message = String.format("User %s commented on your post: %s...",
                commenter, content.substring(0, 15));
        creator.addNotification(new Notification(message));
        for (Comment comment : post.getComments()) {
            User commentCommenter = comment.getCommenter();
            commentCommenter.addNotification(new Notification(message));
        }
    }

    // Iteration VI
    void like(User user, Post post) {
        post.addLike(new Like(user));
    }

    void like(User user, Comment comment) {
        comment.addLike(new Like(user));
    }

    // Iteration VII
    void readNotifications(User user) {
        for (Entry<Notification, ReadingState> entry : user.getNotifications().entrySet().stream()
                .filter(entry -> ReadingState.UNREAD.equals(entry.getValue())).toList()) {
            System.out.println(String.format("%s", entry.getKey().getContent()));
            entry.setValue(ReadingState.READ);
        }
    }
}
