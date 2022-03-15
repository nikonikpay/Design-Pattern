package com.ali.factory;

public class NyPizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {
        return new NYStyleCheesePizza();
    }
}
