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
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Shape result = shapeCollector.getShape(0);
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

    @Test
    public void testGetShape(){
        //Given
        Circle circle = new Circle("Circle", 6);

        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Shape result = shapeCollector.getShape(0);

        //Then
        Assert.assertEquals(result, circle);
    }

    @Test
    public void testRemoveShape() {
        //Given
        Square square = new Square("kwadrat", 6);
        Circle circle = new Circle("Circle", 6);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.removeFigure(square);

        //End
        Shape result = shapeCollector.getShape(0);
        Assert.assertEquals(result, circle);
    }
}
