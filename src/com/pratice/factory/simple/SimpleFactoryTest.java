package com.pratice.factory.simple;

public class SimpleFactoryTest {

    public static void main(String[] args) {


        //用户不在关心生产过程 只关心结果
        SimpleFactory factory=new SimpleFactory();

        factory.getMilk("特仑苏").getName();
    }
}
