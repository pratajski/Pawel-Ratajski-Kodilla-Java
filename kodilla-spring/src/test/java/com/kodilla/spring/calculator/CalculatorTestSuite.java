package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculationsAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calc = context.getBean(Calculator.class);
        //When
        double add = calc.add(3,5);
        //Then
        Assert.assertEquals(8, add, 0.001);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calc = context.getBean(Calculator.class);
        //When
        double sub = calc.sub( 5,5);
        //Then
        Assert.assertEquals(0, sub, 0.001);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calc = context.getBean(Calculator.class);
        //When
        double mul = calc.mul( 5,5);
        //Then
        Assert.assertEquals(25, mul, 0.001);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calc = context.getBean(Calculator.class);
        //When
        double div = calc.div( 5,5);
        //Then
        Assert.assertEquals(1, div, 0.001);
    }

}
