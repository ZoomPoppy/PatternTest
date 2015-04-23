package CoffeeType.Condiment;

import CoffeeType.Beverage;

/**
 * Created by zz on 2015/4/20.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.3;
    }
}
