package com.steffenboe.udemy.oop.oop;

public class Main {
    
    public static void main(String[] args) {
        User user = new User();
        user.createPost("Hello World!");
        user.enable(OnNewCommentNotification.class);
    }
}
