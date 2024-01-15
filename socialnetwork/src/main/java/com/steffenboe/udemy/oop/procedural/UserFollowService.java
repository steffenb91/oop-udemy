package com.steffenboe.udemy.oop.procedural;

/**
 * Service to let users follow each other.
 */
public class UserFollowService {

    /**
     * User follows another user.
     * 
     * @param user        user to follow
     * @param newFollower user who should follow user
     * @throws IllegalArgumentException if already following
     */
    void follow(User user, User newFollower) {
        if (user.getFollowers().contains(newFollower)) {
            throw new IllegalArgumentException("Already following");
        } else {
            user.addFollower(newFollower);
        }
    }
}
