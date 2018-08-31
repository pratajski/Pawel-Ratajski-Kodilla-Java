package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaSauceDecorator extends AbstractPizzaOrderDecorator{
    public PizzaSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + sauce";
    }
}
