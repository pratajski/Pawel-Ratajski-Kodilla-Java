package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaTunaDecorator extends AbstractPizzaOrderDecorator{
    public PizzaTunaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + tuna";
    }

}
