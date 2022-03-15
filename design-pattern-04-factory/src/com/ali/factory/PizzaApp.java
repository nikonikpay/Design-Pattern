package com.ali.factory;

public class PizzaApp {


    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("Chesse");
        System.out.println("Ethan ordered  a pizza " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("Chesse");
        System.out.println("jafar ordered a pizza "+ pizza.getName() + "\n");


    }
}
