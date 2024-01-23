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
        notifyAll(newcomment);
        comments.add(newcomment);
    }

    private void notifyAll(Post newComment) {
        creator.addNotification(new OnNewCommentNotification(newComment.creator, this));
        for (Post comment : comments) {
            comment.creator.addNotification(new OnNewCommentNotification(newComment.creator, this));
        }
    }

    public void addLike(Like like) {
        likes.add(like);
    }

    @Override
    public String toString() {
        return content;
    }

}
