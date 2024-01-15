package com.steffenboe.udemy.oop.procedural;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    List<Post> posts = new ArrayList<>();

    public void add(Post post) {
        posts.add(post);
    }

}
