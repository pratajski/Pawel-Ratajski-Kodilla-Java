package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.Test;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.CalculateAdvStatistics;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatistics {
   @Test
    public void testCalculateStatisticsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> statisticsMap = new ArrayList<>();
        statisticsMap.add("Pierwszy User");
        statisticsMap.add("Drugi User");
        statisticsMap.add("Trzeci User");
        statisticsMap.add("Czwarty User");
        statisticsMap.add("Piaty User");
       when(statisticsMock.usersNames()).thenReturn(statisticsMap);
       CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When

        //Then
        System.out.println(statisticsMap);
    }

 //   @Test
 //   public testUsersQuantity(){
//        CalculateStatistics.
//    }

}
