package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.CalculateAdvStatistics;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatistics {
   @Test
    public void testCalculateStatistics0Posts(){
        //Given
        Statistics statistics0Posts = mock(Statistics.class);
       when(statistics0Posts.postsCount()).thenReturn(0);

        //When
       CalculateStatistics calculateStatistics = new CalculateStatistics();
       calculateStatistics.calculateAdvStatistics(statistics0Posts);

        //Then
        Assert.assertEquals(calculateStatistics.getPostsQuantity(), 0);

    }

    @Test
    public void testCalculateStatistics1000Posts(){
        //Given
        Statistics statistics1000Posts = mock(Statistics.class);
        when(statistics1000Posts.postsCount()).thenReturn(1000);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statistics1000Posts);

        //Then
      //  Assert.assertEquals(calculateStatistics.postsCount(), 1000);
    }

    @Test
    public void testCalculateStatistics0Comments(){
        //Given
        Statistics statistics0Comments = mock(Statistics.class);
        when(statistics0Comments.commentsCount()).thenReturn(0);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statistics0Comments);

        //Then
        Assert.assertEquals(calculateStatistics.getCommentsQuantity(), 0);
    }

    @Test
    public void testCalculateStatisticsCommentsAndPosts(){
        //Given
        Statistics statisticsMoreCommentsThanPosts = mock(Statistics.class);
        when(statisticsMoreCommentsThanPosts.postsCount()).thenReturn(100);
        when(statisticsMoreCommentsThanPosts.commentsCount()).thenReturn(1000);


        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMoreCommentsThanPosts);

        //Then
       Assert.assertEquals(calculateStatistics.getPostsQuantity(), 100);
       Assert.assertEquals(calculateStatistics.getCommentsQuantity(), 1000);

//============================================================
        when(statisticsMoreCommentsThanPosts.postsCount()).thenReturn(555);
        when(statisticsMoreCommentsThanPosts.commentsCount()).thenReturn(100);


        //When
        CalculateStatistics calculateStatistics2 = new CalculateStatistics();
        calculateStatistics2.calculateAdvStatistics(statisticsMoreCommentsThanPosts);

        //Then
        Assert.assertEquals(calculateStatistics2.getPostsQuantity(), 555);
        Assert.assertEquals(calculateStatistics2.getCommentsQuantity(), 100);



    }

    @Test
    public void testCalculateStatistics0Users(){
        //Given
        Statistics statistics0Users = mock(Statistics.class);
        ArrayList<String> statisticsMap = new ArrayList<>();
        when(statistics0Users.usersNames()).thenReturn(statisticsMap);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statistics0Users);

        //Then
        Assert.assertEquals(calculateStatistics.getUsersQuantity(), 0);
    }

}
