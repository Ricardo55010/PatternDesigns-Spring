package com.example.designPatterns.Adapter;

public class AppleAdapter implements Apple{
    Orange orange;

    public AppleAdapter(Orange orange){
        this.orange = orange;
    }
    @Override
    public String getVariety() {
        return this.orange.getVariety();
    }

    @Override
    public void eat() {
        orange.peel();
        orange.eat();
    }
}
