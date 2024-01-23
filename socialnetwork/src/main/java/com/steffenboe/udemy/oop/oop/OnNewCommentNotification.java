package com.steffenboe.udemy.oop.oop;

public class OnNewCommentNotification implements Notification {

    private User commenter;
    private Post post;

    public OnNewCommentNotification(User commenter, Post post) {
        this.commenter = commenter;
        this.post = post;
    }

    @Override
    public void handle() {
        System.out.println(String.format("New comment from user %s for post %s", commenter, post));
    }

    @Override
    public boolean hasSameType(Notification other) {
        return other.getClass().equals(getClass());
    }

}
