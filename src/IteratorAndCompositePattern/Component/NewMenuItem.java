package IteratorAndCompositePattern.Component;

import IteratorAndCompositePattern.Component.MenuComponent;

import java.util.Iterator;

/**
 * Created by zz on 2015/4/27.
 */
public class NewMenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetatian;
    double price;

    public NewMenuItem(String name, String description, boolean vegetatian, double price) {
        this.name = name;
        this.description = description;
        this.vegetatian = vegetatian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetatian;
    }

    @Override
    public void print() {
        System.out.println(" "+getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("   --"+getDescription());
    }
    public Iterator createIterator(){
        return new NullIterator();
    }
}
