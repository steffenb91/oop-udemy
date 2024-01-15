package com.steffenboe.udemy.oop.procedural;

import java.util.ArrayList;
import java.util.List;

public class Comment {

    private User commenter;
    private String content;
    private List<Like> likes = new ArrayList<>();

    public Comment(User commenter, String content) {
        this.commenter = commenter;
        this.content = content;
    }

    // Iteration IV
    public User getCommenter() {
        return commenter;
    }

    // Iteration VI
    public List<Like> getLikes() {
        return likes;
    }

    public void addLike(Like like) {
        this.likes.add(like);
    }

}
