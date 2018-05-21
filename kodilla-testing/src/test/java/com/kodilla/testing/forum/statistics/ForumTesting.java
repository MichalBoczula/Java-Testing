package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

public class ForumTesting {

    @Test
    public void testQuantityOfPostsIsEmpty() {
        //given
        Forum forum = new Forum();

        //when
        int result = forum.postsCount();

        //then
        Assert.assertEquals(0, result);
    }


    @Test
    public void testQuantityOfPosts() {
        //given
        Forum forum = new Forum();

        //when
        int result = forum.postsCount();

        //then
        Assert.assertEquals(10, result);
    }

    @Test
    public void testQuantityOfCommentsIsEmpty() {
        //given
        Forum forum = new Forum();

        //when
        int result = forum.commentsCount();

        //then
        Assert.assertEquals(11, result);
    }

    @Test
    public void testQuantityOfComments() {
        //given
        Forum forum = new Forum();

        //when
        int result = forum.commentsCount();

        //then
        Assert.assertEquals(11, result);
    }

    @Test
    public void testQuantityOfUsersIsEmpty() {
        //given
        Forum forum = new Forum();

        //when
        int result = forum.usersNames().size();

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testQuantityOfUsers() {
        //given
        Forum forum = new Forum();

        //when
        int result = forum.usersNames().size();

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testLessQuantityOfPostsThenQuantityOfComments(){
        //given
        Forum forum = new Forum();

        //when
        int result = forum.usersNames().size();

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testMoreQuantityOfPostsThenQuantityOfComments(){
        //given
        Forum forum = new Forum();

        //when
        int result = forum.usersNames().size();

        //then
        Assert.assertEquals(0, result);
    }

}
