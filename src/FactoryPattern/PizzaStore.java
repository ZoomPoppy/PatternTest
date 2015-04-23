package FactoryPattern;

/**
 * Created by zz on 2015/4/17.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = creatPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    abstract Pizza creatPizza(String type);

}
