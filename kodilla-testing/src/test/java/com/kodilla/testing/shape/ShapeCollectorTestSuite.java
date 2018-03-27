package com.kodilla.testing.shape;

import org.junit.*;
import org.junit.Assert;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testGetShapeName()    {
        //Given
        Circle circle = new Circle("kolo", 6);
        //When
        String result = circle.getShapeName();
        //Then
        Assert.assertEquals("kolo", result);
    }

    @Test
    public void testGetField() {
        //Given
        Square square = new Square("kwadrat", 6);
        //When
        double result = square.getField();
        //Then
        Assert.assertEquals(36, result, 0);
    }




    //End
}
