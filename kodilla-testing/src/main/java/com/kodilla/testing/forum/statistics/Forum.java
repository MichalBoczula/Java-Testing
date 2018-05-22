package com.kodilla.testing.forum.statistics;

public class Forum {

    private int QuantityOfPosts;
    private int QuantityOfComments;
    private int QuantityOfUsers;
    private int AvrPostsOnUser;
    private int AvrCommentsOnUser;
    private int AvrCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.QuantityOfUsers = statistics.usersNames().size();

        this.QuantityOfPosts = statistics.postsCount();

        this.QuantityOfComments = statistics.commentsCount();

        if(QuantityOfUsers > 0 && QuantityOfPosts > 0){
            this.AvrPostsOnUser = QuantityOfPosts/QuantityOfUsers;
        } else if(QuantityOfUsers == 0 && QuantityOfPosts > 0){
            this.AvrPostsOnUser = QuantityOfPosts;
        } else if (QuantityOfPosts == 0){
            this.AvrPostsOnUser = 0;
        }

        if(QuantityOfUsers > 0 && QuantityOfComments > 0){
            this.AvrCommentsOnUser = QuantityOfComments/QuantityOfUsers;
        } else if (QuantityOfUsers == 0 && QuantityOfComments > 0){
            this.AvrCommentsOnUser = QuantityOfComments;
        } else if (QuantityOfComments == 0){
            this.AvrCommentsOnUser = 0;
        }

        if(QuantityOfPosts > 0 && QuantityOfComments > 0){
            this.AvrCommentsOnPost = QuantityOfComments/QuantityOfPosts;
        } else if(QuantityOfPosts == 0 && QuantityOfComments > 0){
            this.AvrCommentsOnPost = QuantityOfComments;
        } else if(QuantityOfComments == 0) {
            this.AvrCommentsOnPost = 0;
        }

    }

    public int getQuantityOfPosts() {
        return QuantityOfPosts;
    }

    public int getQuantityOfComments() {
        return QuantityOfComments;
    }

    public int getQuantityOfUsers() {
        return QuantityOfUsers;
    }

    public int getAvrPostsOnUser() {
        return AvrPostsOnUser;
    }

    public int getAvrCommentsOnUser() {
        return AvrCommentsOnUser;
    }

    public int getAvrCommentsOnPost() {
        return AvrCommentsOnPost;
    }
}
