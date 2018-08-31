package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaSalmonDecorator extends AbstractPizzaOrderDecorator{
    public PizzaSalmonDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + salmon";
    }
}
