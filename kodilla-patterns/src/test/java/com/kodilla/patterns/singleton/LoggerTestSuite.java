package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {


    @Test
    public void testGetFileName() {
        //Given
        Logger.getInstance().log("2018-07-20");
        //When
        String logName = Logger.getInstance().getLastLog();
        System.out.println("Last Log: " + logName);
        //Then
        Assert.assertEquals("2018-07-20", logName);
    }

}
