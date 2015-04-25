package TemplateMeathPattern;

import CommandPattern.Command.Command;

/**
 * Created by zz on 2015/4/25.
 */
public class BeverageTestDrive {
    public static void main(String[] args){
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();

    }
}
