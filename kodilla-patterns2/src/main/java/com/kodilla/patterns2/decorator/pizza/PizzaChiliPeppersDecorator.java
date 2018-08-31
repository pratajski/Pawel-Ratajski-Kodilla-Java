package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaChiliPeppersDecorator extends AbstractPizzaOrderDecorator{
    public PizzaChiliPeppersDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }


    @Override
    public String getComponent() {
        return super.getComponent() + " + chili peppers";
    }
}
