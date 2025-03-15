package com.example.designPatterns.Decorator;

import java.math.BigDecimal;
import java.util.Formatter;

public abstract class Pizza {
    protected String description;

    public String getDescription(){
        return this.description;
    }

    public abstract BigDecimal getCost();
}
