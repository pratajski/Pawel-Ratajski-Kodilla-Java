package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
 //       Assert.assertEquals(Math.PI * Math.pow(4.50, 2.0), driving.getArea(), 0);
        Assert.assertEquals("Driving", driving.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
//        Assert.assertEquals(28.0, painting.getCircumference(), 0);
        Assert.assertEquals("Paint", painting.getTaskName());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
//        Assert.assertEquals(37.50, shopping.executeTask() .getArea(), 0);
        Assert.assertEquals("Shopping", shopping.getTaskName());
    }

}
