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

    public User getCommenter() {
        return commenter;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void addLike(Like like) {
        this.likes.add(like);
    }

}
