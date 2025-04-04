package com.example.designPatterns.factory;

public interface Pet {
    void setName(String name);
    String getName();

    boolean isHungry();
    void feed();
    String getType();
}
