package com.ali.factory;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing ..."+name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ..");
        System.out.println("Adding toppings ...");
        for(String topping: toppings){
            System.out.println("   "+topping);
        }
    }

    void bake(){
        System.out.println("Bake for 25 min at 350");
    }


    void cut(){
        System.out.println("Cutting the pizza");

    }

    void box(){
        System.out.println("Place pizza in official store box ...");
    }

    public String getName() {
        return name;
    }
}
