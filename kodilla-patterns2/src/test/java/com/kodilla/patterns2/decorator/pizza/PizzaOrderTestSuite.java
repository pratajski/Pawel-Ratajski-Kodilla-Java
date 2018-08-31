package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetComponent() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        String component = theOrder.getComponent();
        //Then
        assertEquals("Standard Pizza", component);
    }

    @Test
    public void testBasicPizzaWithCheeseOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaCheeseDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testBasicPizzaWithCheeseOrderGetComponent() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaCheeseDecorator(theOrder);
        //When
        String component = theOrder.getComponent();
        //Then
        assertEquals("Standard Pizza + cheese", component);
    }

    @Test
    public void testBasicPizzaWithChilliPeppersOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaChiliPeppersDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21), calculatedCost);
    }

    @Test
    public void testBasicPizzaWithChilliPeppersOrderGetComponent() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaChiliPeppersDecorator(theOrder);
        //When
        String component = theOrder.getComponent();
        //Then
        assertEquals("Standard Pizza + chili peppers", component);
    }

    @Test
    public void testBasicPizzaWithAllComponentsOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaChiliPeppersDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        theOrder = new PizzaOlivesDecorator(theOrder);
        theOrder = new PizzaSalmonDecorator(theOrder);
        theOrder = new PizzaSauceDecorator(theOrder);
        theOrder = new PizzaSpinachDecorator(theOrder);
        theOrder = new PizzaTunaDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(43), calculatedCost);
    }

    @Test
    public void testBasicPizzaWithAllComponentsOrderGetComponent() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaChiliPeppersDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        theOrder = new PizzaOlivesDecorator(theOrder);
        theOrder = new PizzaSalmonDecorator(theOrder);
        theOrder = new PizzaSauceDecorator(theOrder);
        theOrder = new PizzaSpinachDecorator(theOrder);
        theOrder = new PizzaTunaDecorator(theOrder);
        //When
        String component = theOrder.getComponent();
        //Then
        assertEquals("Standard Pizza + cheese + chili peppers + mushrooms + olives + salmon + sauce + spinach + tuna", component);
    }








}
