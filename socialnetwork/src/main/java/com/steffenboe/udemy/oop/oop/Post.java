package com.steffenboe.udemy.oop.oop;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String content;
    private List<Post> comments = new ArrayList<>();
    private User creator;
    private List<Like> likes = new ArrayList<>();

    public Post(User creator, String content) {
        this.creator = creator;
        this.content = content;
    }

    public void addComment(Post newcomment) {
        String message = toPreviewMessage(newcomment);
        notifyAll(message);
        comments.add(newcomment);
    }

    private String toPreviewMessage(Post newcomment) {
        return String.format("User %s commented on your post: %s...", newcomment.creator,
                newcomment.content.substring(0, 15));
    }

    private void notifyAll(String message) {
        creator.addNotification(new Notification(message));
        for (Post comment : comments) {
            comment.creator.addNotification(new Notification(message));
        }
    }

    public void addLike(Like like) {
        likes.add(like);
    }

}
