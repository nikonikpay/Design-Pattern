package com.ali.decorative;

public class Decaf extends Beverage{

    public Decaf() {
        description="Decaf beverage";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
