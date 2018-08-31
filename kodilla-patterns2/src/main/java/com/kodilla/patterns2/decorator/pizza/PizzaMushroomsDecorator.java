package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMushroomsDecorator extends AbstractPizzaOrderDecorator{
    public PizzaMushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }


    @Override
    public String getComponent() {
        return super.getComponent() + " + mushrooms";
    }
}
