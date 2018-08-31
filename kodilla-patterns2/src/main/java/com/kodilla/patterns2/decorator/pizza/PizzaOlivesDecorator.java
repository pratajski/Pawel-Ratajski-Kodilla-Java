package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaOlivesDecorator extends AbstractPizzaOrderDecorator{
    public PizzaOlivesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }


    @Override
    public String getComponent() {
        return super.getComponent() + " + olives";
    }
}
