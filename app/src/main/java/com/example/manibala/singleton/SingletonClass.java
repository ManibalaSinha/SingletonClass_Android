package com.example.manibala.singleton;

public class SingletonClass {
    private static volatile SingletonClass sSoleInstance = new SingletonClass();
    //private constructor
    private SingletonClass(){}
    
    public static SingletonClass getInstance(){
        return sSoleInstance;
    }
}
