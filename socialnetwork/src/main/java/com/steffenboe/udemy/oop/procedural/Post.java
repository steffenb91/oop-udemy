package com.steffenboe.udemy.oop.procedural;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String content;
    private List<Comment> comments = new ArrayList<>();
    private User creator;
    private List<Like> likes = new ArrayList<>();

    public Post(String content) {
        this.content = content;
    }

    public Post(User creator, String content) {
        this.creator = creator;
        this.content = content;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public User getCreator() {
        return creator;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void addLike(Like like) {
        likes.add(like);
    }

}
