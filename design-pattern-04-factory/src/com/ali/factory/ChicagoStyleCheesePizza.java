package com.ali.factory;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza() {
        name = "Chicago style cheese pizza";
        dough="Extra thick crust dough";
        sauce="Plum tomato sauce";

        toppings.add("Shredded Mozarella cheese");





    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza in square slice");
    }
}
