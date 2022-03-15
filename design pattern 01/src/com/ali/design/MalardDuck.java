package com.ali.design;

public class MalardDuck extends Duck {

    public MalardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(" i am a real malard duck");
    }
}
