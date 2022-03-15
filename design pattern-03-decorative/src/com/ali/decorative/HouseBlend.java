package com.ali.decorative;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description="The house blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
