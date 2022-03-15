package com.ali.decorative;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description="Dark roast beverage";
    }

    @Override
    public double cost() {
        return .99;
    }
}
