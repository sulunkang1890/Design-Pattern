package com.pratice.factory.simple;

public class SimpleFactory {
    public Milk getMilk(String name){
        if(name.equals("特仑苏")){
            return new Telunsu();
        }
        return null;
    }
}
