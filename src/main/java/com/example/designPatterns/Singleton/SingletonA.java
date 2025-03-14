package com.example.designPatterns.Singleton;

public class SingletonA {
    public static SingletonA instance;

    private SingletonA(){
        super();
    }
    public static SingletonA getInstance() {
        if(instance==null){
            synchronized (SingletonA.class){
                if(instance==null){
                    instance = new SingletonA();
                }
            }
        }
        return instance;
    }
}
