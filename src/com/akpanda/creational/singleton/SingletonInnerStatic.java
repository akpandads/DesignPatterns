package com.akpanda.creational.singleton;

public class SingletonInnerStatic {

    private SingletonInnerStatic(){
    }
    private static class SingletonStaticImpleClass{
       private static final SingletonInnerStatic INSTANCE = new SingletonInnerStatic();
    }
    private SingletonInnerStatic getInstance(){
        return SingletonStaticImpleClass.INSTANCE;
    }
}
