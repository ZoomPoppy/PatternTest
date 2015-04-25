package TemplateMeathPattern;

/**
 * Created by zz on 2015/4/25.
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");

    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");

    }


}
