package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTesting {

    @Test
    public void testQuantityWhenEverythingIsZero() {
        //given
        Forum forum = new Forum();
        List<String> namesMock = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(namesMock);
        forum.calculateAdvStatistics(statisticsMock);

        //when
        int resultPosts = forum.getQuantityOfPosts();
        int resultComments = forum.getQuantityOfComments();
        int resultUsers = forum.getQuantityOfUsers();
        int resultAvrPost = forum.getAvrPostsOnUser();
        int resultAvrComments = forum.getAvrCommentsOnUser();
        int resultAvrCommentsOnPost = forum.getAvrCommentsOnPost();

        //then
        Assert.assertEquals(0, resultPosts);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(0, resultUsers);
        Assert.assertEquals(0, resultAvrPost);
        Assert.assertEquals(0, resultAvrComments);
        Assert.assertEquals(0, resultAvrCommentsOnPost);
    }

    @Test
    public void testQuantityWhenEverythingIsGreaterThenZeroAndAmountOfPostIsMoreThenAmountOfComments() {
        //given
        Forum forum = new Forum();
        List<String> namesMock = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);

        String user = "a";
        for(int i = 0; i < 100; i++){
            namesMock.add(user);
            user+= "a";
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(namesMock);
        forum.calculateAdvStatistics(statisticsMock);

        //when
        int resultPosts = forum.getQuantityOfPosts();
        int resultComments = forum.getQuantityOfComments();
        int resultUsers = forum.getQuantityOfUsers();
        int resultAvrPost = forum.getAvrPostsOnUser();
        int resultAvrComments = forum.getAvrCommentsOnUser();
        int resultAvrCommentsOnPost = forum.getAvrCommentsOnPost();
        boolean result = false;

        if(resultComments < resultPosts){
            result = true;
        }

        //then
        Assert.assertEquals(1000, resultPosts);
        Assert.assertEquals(100, resultComments);
        Assert.assertEquals(100, resultUsers);
        Assert.assertEquals(10, resultAvrPost);
        Assert.assertEquals(1, resultAvrComments);
        Assert.assertEquals(0, resultAvrCommentsOnPost);
        Assert.assertTrue(result);
    }

    @Test
    public void testQuantityWhenEverythingAmountOfUsersIsZero() {
        //given
        Forum forum = new Forum();
        List<String> namesMock = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);

        String user = "a";
        for(int i = 0; i < 100; i++){
            namesMock.add(user);
            user+= "a";
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10000);
        when(statisticsMock.usersNames()).thenReturn(namesMock);
        forum.calculateAdvStatistics(statisticsMock);

        //when
        int resultPosts = forum.getQuantityOfPosts();
        int resultComments = forum.getQuantityOfComments();
        int resultUsers = forum.getQuantityOfUsers();
        int resultAvrPost = forum.getAvrPostsOnUser();
        int resultAvrComments = forum.getAvrCommentsOnUser();
        int resultAvrCommentsOnPost = forum.getAvrCommentsOnPost();
        boolean result = false;

        if(resultComments > resultPosts){
            result = true;
        }

        //then
        Assert.assertEquals(1000, resultPosts);
        Assert.assertEquals(10000, resultComments);
        Assert.assertEquals(100, resultUsers);
        Assert.assertEquals(10, resultAvrPost);
        Assert.assertEquals(100, resultAvrComments);
        Assert.assertEquals(10, resultAvrCommentsOnPost);
        Assert.assertTrue(result);
    }

    @Test
    public void testQuantityWhenEverythingIsGreaterThenZeroAndAmountOfPostIsLessThenAmountOfComments() {
        //given
        Forum forum = new Forum();
        List<String> namesMock = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(namesMock);
        forum.calculateAdvStatistics(statisticsMock);

        //when
        int resultPosts = forum.getQuantityOfPosts();
        int resultComments = forum.getQuantityOfComments();
        int resultUsers = forum.getQuantityOfUsers();
        int resultAvrPost = forum.getAvrPostsOnUser();
        int resultAvrComments = forum.getAvrCommentsOnUser();
        int resultAvrCommentsOnPost = forum.getAvrCommentsOnPost();

        //then
        Assert.assertEquals(100, resultPosts);
        Assert.assertEquals(500, resultComments);
        Assert.assertEquals(0, resultUsers);
        Assert.assertEquals(100, resultAvrPost);
        Assert.assertEquals(500, resultAvrComments);
        Assert.assertEquals(5, resultAvrCommentsOnPost);
    }

    @Test
    public void testQuantityWhenAmountOfUserIsGreaterThenZeroAndRestIsZero() {
        //given
        Forum forum = new Forum();
        List<String> namesMock = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);

        String user = "a";
        for(int i = 0; i < 100; i++){
            namesMock.add(user);
            user+= "a";
        }

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(namesMock);
        forum.calculateAdvStatistics(statisticsMock);

        //when
        int resultPosts = forum.getQuantityOfPosts();
        int resultComments = forum.getQuantityOfComments();
        int resultUsers = forum.getQuantityOfUsers();
        int resultAvrPost = forum.getAvrPostsOnUser();
        int resultAvrComments = forum.getAvrCommentsOnUser();
        int resultAvrCommentsOnPost = forum.getAvrCommentsOnPost();

        //then
        Assert.assertEquals(0, resultPosts);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(100, resultUsers);
        Assert.assertEquals(0, resultAvrPost);
        Assert.assertEquals(0, resultAvrComments);
        Assert.assertEquals(0, resultAvrCommentsOnPost);
    }
}
