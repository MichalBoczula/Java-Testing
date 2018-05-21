package com.kodilla.testing.forum.statistics;

public class Comment {

    private Post post;
    private String desc;

    public Comment(Post post, String desc) {
        this.post = post;
        this.desc = desc;
    }
}
