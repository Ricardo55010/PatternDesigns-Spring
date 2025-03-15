package com.example.designPatterns.Decorator;

import java.math.BigDecimal;

public class Pepperoni extends PizzaIngredient {
    private Pizza pizza;
    public Pepperoni(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " Pepperoni";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(1.50).add(pizza.getCost());
    }
}
