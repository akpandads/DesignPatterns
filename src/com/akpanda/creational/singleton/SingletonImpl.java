package com.akpanda.creational.singleton;

public class SingletonImpl {
    private static SingletonImpl singleton;
    int value;
    private SingletonImpl(){
        value=2;
    }
    private static SingletonImpl getSingleton(){
        if(singleton==null){
            singleton = new SingletonImpl();
        }
        return singleton;
    }
}
