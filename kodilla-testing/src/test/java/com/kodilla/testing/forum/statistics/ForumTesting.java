package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTesting {
    @Test
    public void testQuantityWhenEverythingIsZero() {
        //given
        final Forum forum = new Forum();
        final  List<String> namesMock = new ArrayList<>();
        final Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(namesMock);

        //when
        forum.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(0, forum.getQuantityOfPosts());
        assertEquals(0, forum.getQuantityOfComments());
        assertEquals(0, forum.getQuantityOfUsers());
        assertEquals(0, forum.getAvrPostsOnUser());
        assertEquals(0, forum.getAvrCommentsOnUser());
        assertEquals(0, forum.getAvrCommentsOnPost());
    }

    @Test
    public void testQuantityWhenEverythingIsGreaterThenZeroAndAmountOfPostIsMoreThenAmountOfComments() {
        //given
        final Forum forum = new Forum();
        final List<String> namesMock = new ArrayList<>();
        final Statistics statisticsMock = mock(Statistics.class);

        boolean result = false;
        String user = "a";

        for(int i = 0; i < 100; i++){
            namesMock.add(user);
            user+= "a";
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(namesMock);

        //when
        forum.calculateAdvStatistics(statisticsMock);
        int resultPosts = forum.getQuantityOfPosts();
        int resultComments = forum.getQuantityOfComments();

        if(resultComments < resultPosts){
            result = true;
        }

        //then
        assertEquals(1000, resultPosts);
        assertEquals(100, resultComments);
        assertEquals(100, forum.getQuantityOfUsers());
        assertEquals(10, forum.getAvrPostsOnUser());
        assertEquals(1, forum.getAvrCommentsOnUser());
        assertEquals(0, forum.getAvrCommentsOnPost());
        assertTrue(result);
    }

    @Test
    public void testQuantityWhenEverythingIsGreaterThenZeroAmountOfUsersIsZero() {
        //given
        final Forum forum = new Forum();
        final List<String> namesList = new ArrayList<>();
        final Statistics statisticsMock = mock(Statistics.class);

        boolean result = false;
        String user = "a";

        for(int i = 0; i < 100; i++){
            namesList.add(user);
            user+= "a";
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10000);
        when(statisticsMock.usersNames()).thenReturn(namesList);

        //when
        forum.calculateAdvStatistics(statisticsMock);
        int resultPosts = forum.getQuantityOfPosts();
        int resultComments = forum.getQuantityOfComments();

        if(resultComments > resultPosts){
            result = true;
        }

        //then
        assertEquals(1000, resultPosts);
        assertEquals(10000, resultComments);
        assertEquals(100, forum.getQuantityOfUsers());
        assertEquals(10, forum.getAvrPostsOnUser());
        assertEquals(100, forum.getAvrCommentsOnUser());
        assertEquals(10, forum.getAvrCommentsOnPost());
        assertTrue(result);
    }

    @Test
    public void testQuantityWhenEverythingIsGreaterThenZeroAndAmountOfPostIsLessThenAmountOfComments() {
        //given
        final Forum forum = new Forum();
        final List<String> namesMock = new ArrayList<>();
        final Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(namesMock);

        //when
        forum.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(100, forum.getQuantityOfPosts());
        assertEquals(500, forum.getQuantityOfComments());
        assertEquals(0, forum.getQuantityOfUsers());
        assertEquals(100, forum.getAvrPostsOnUser());
        assertEquals(500, forum.getAvrCommentsOnUser());
        assertEquals(5, forum.getAvrCommentsOnPost());
    }

    @Test
    public void testQuantityWhenAmountOfUserIsGreaterThenZeroAndRestIsZero() {
        //given
        final Forum forum = new Forum();
        final List<String> namesMock = new ArrayList<>();
        final Statistics statisticsMock = mock(Statistics.class);

        String user = "a";
        for(int i = 0; i < 100; i++){
            namesMock.add(user);
            user+= "a";
        }

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(namesMock);

        //when
        forum.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(0, forum.getQuantityOfPosts());
        assertEquals(0, forum.getQuantityOfComments());
        assertEquals(100, forum.getQuantityOfUsers());
        assertEquals(0, forum.getAvrPostsOnUser());
        assertEquals(0, forum.getAvrCommentsOnUser());
        assertEquals(0, forum.getAvrCommentsOnPost());
    }
}
