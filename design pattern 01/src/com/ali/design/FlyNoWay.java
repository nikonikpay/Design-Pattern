package com.ali.design;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can Not Fly");
    }
}
