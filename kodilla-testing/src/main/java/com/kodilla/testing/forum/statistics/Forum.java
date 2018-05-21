package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class Forum  implements Statistics {

    private List<String> names = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();
    private List<Integer> forumStatistics = new ArrayList<>();
    private int QuantityOfPosts;
    private int QuantityOfComments;
    private int QuantityOfUsers;
    private int AvrPostsOnUser;
    private int AvrCommentsOnUser;
    private int AvrCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.QuantityOfUsers = usersNames().size();
        forumStatistics.add(QuantityOfUsers);

        this.QuantityOfPosts = postsCount();
        forumStatistics.add(QuantityOfPosts);

        this.QuantityOfComments = commentsCount();
        forumStatistics.add(QuantityOfComments);

        this.AvrPostsOnUser = QuantityOfPosts/QuantityOfUsers;
        forumStatistics.add(AvrPostsOnUser);

        this.AvrCommentsOnUser = QuantityOfComments/QuantityOfUsers;
        forumStatistics.add(AvrCommentsOnUser);

        this.AvrCommentsOnPost = QuantityOfComments/QuantityOfPosts;
        forumStatistics.add(AvrCommentsOnPost);
    }

    @Override
    public List<String> usersNames() {
        return names;
    }

    @Override
    public int postsCount() {
        return posts.size();
    }

    @Override
    public int commentsCount() {
        return comments.size();
    }

    public List<Integer> showStatistics(){
        return forumStatistics;
    }
}
