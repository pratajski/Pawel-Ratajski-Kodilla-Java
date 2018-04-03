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
        Assert.assertEquals(calculateStatistics.postsCount(), 0);

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
        Assert.assertEquals(calculateStatistics.postsCount(), 1000);
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
        Assert.assertEquals(calculateStatistics.commentsCount(), 0);
    }

    @Test
    public void testCalculateStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMoreCommentsThanPosts = mock(Statistics.class);
        when(statisticsMoreCommentsThanPosts.postsCount()).thenReturn(1000);
        when(statisticsMoreCommentsThanPosts.commentsCount()).thenReturn(1000);


        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMoreCommentsThanPosts);

 //       calculateStatistics.calculateAdvStatistics(statisticsMoreCommentsThanPosts.postsCount());
 //       calculateStatistics.calculateAdvStatistics(statisticsMoreCommentsThanPosts.commentsCount());

        //Then
 //       Assert.assertEquals(calculateStatistics.postsCount(), 1000);
    }

    @Test
    public void testCalculateStatisticsLessCommentsThanPosts(){
        //Given
        Statistics statisticsLessCommentsThanPosts = mock(Statistics.class);
        when(statisticsLessCommentsThanPosts.postsCount()).thenReturn(1000);
        when(statisticsLessCommentsThanPosts.commentsCount()).thenReturn(1000);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();

 //       calculateStatistics.calculateAdvStatistics(statisticsLessCommentsThanPosts.postsCount());
 //       calculateStatistics.calculateAdvStatistics(statisticsLessCommentsThanPosts.commentsCount());

        //Then
 //       Assert.assertEquals(calculateStatistics.postsCount(), 1500);
    }


    @Test
    public void testCalculateStatistics0Users(){
        //Given
        Statistics statistics0Users = mock(Statistics.class);
        ArrayList<String> statisticsMap = new ArrayList<>();
 //       statisticsMap.add("Pierwszy User");
 //       statisticsMap.add("Drugi User");
 //       statisticsMap.add("Trzeci User");
 //       statisticsMap.add("Czwarty User");
 //       statisticsMap.add("Piaty User");
        when(statistics0Users.usersNames()).thenReturn(statisticsMap);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.getUsersQuantity();

        //Then
        Assert.assertEquals(calculateStatistics.usersNames(), 0);
    }

    @Test
    public void testCalculateStatistics100Users(){
        //Given
        Statistics statistics100Users = mock(Statistics.class);
        ArrayList<String> statisticsMap = new ArrayList<>();
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
        statisticsMap.add("Szósty User");
        statisticsMap.add("Siódmy User");
        statisticsMap.add("Ósmy User");
        statisticsMap.add("Dziewiąty User");
        statisticsMap.add("Dziesiąty User");
        when(statistics100Users.usersNames()).thenReturn(statisticsMap);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statistics100Users);

        //Then
        Assert.assertEquals(calculateStatistics.usersNames(), 100);
    }



 //   @Test
 //   public testUsersQuantity(){
//        CalculateStatistics.
//    }

}
