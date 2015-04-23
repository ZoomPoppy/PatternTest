package FactoryPattern;

import java.util.ArrayList;

/**
 * Created by zz on 2015/4/17.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    void prepare() {
        System.out.println("Preparing"+name);
        System.out.println("Tossing douth");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping: ");
        for (int i = 0;i<toppings.size();i++){
            System.out.println(" " +toppings.get(i));
        }

    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");

    }

    void box(){
        System.out.println("Place pizzas in offcial PizzaStore box");;
    }
    public String getName(){
        return name;
    }
}
