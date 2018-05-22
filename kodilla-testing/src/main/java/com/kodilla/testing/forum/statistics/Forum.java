package com.kodilla.testing.forum.statistics;

public class Forum {

    private int quantityOfPosts;
    private int quantityOfComments;
    private int quantityOfUsers;
    private int avrPostsOnUser;
    private int avrCommentsOnUser;
    private int avrCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.quantityOfUsers = statistics.usersNames().size();

        this.quantityOfPosts = statistics.postsCount();

        this.quantityOfComments = statistics.commentsCount();

        if(quantityOfUsers > 0 && quantityOfPosts > 0){
            this.avrPostsOnUser = quantityOfPosts/quantityOfUsers;
        } else if(quantityOfUsers == 0 && quantityOfPosts > 0){
            this.avrPostsOnUser = quantityOfPosts;
        } else if (quantityOfPosts == 0){
            this.avrPostsOnUser = 0;
        }

        if(quantityOfUsers > 0 && quantityOfComments > 0){
            this.avrCommentsOnUser = quantityOfComments/quantityOfUsers;
        } else if (quantityOfUsers == 0 && quantityOfComments > 0){
            this.avrCommentsOnUser = quantityOfComments;
        } else if (quantityOfComments == 0){
            this.avrCommentsOnUser = 0;
        }

        if(quantityOfPosts > 0 && quantityOfComments > 0){
            this.avrCommentsOnPost = quantityOfComments/quantityOfPosts;
        } else if(quantityOfPosts == 0 && quantityOfComments > 0){
            this.avrCommentsOnPost = quantityOfComments;
        } else if(quantityOfComments == 0) {
            this.avrCommentsOnPost = 0;
        }

    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getAvrPostsOnUser() {
        return avrPostsOnUser;
    }

    public int getAvrCommentsOnUser() {
        return avrCommentsOnUser;
    }

    public int getAvrCommentsOnPost() {
        return avrCommentsOnPost;
    }
}
