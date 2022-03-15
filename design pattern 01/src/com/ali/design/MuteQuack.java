package com.ali.design;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence so no quack");
    }
}
