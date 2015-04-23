package CoffeeType.Condiment;

import CoffeeType.Beverage;

/**
 * Created by zz on 2015/4/20.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
