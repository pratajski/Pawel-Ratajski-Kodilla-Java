package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
            //Given
            int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
            //when
            double average = ArrayOperations.getAverage(numbers);
            //Then
            Assert.assertEquals(9.0, average, 0);

    }
}
