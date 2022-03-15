package com.ali.design;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck malard = new MalardDuck();
        malard.performFly();
        malard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
