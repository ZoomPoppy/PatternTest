package CoffeeType.Condiment;

import CoffeeType.Beverage;

/**
 * Created by zz on 2015/4/20.
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;
    public Mocha(Beverage b){
        beverage = b;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}
