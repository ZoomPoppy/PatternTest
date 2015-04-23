package CoffeeType;

import CoffeeType.Beverage;
import CoffeeType.Condiment.Milk;
import CoffeeType.Condiment.Mocha;
import CoffeeType.DarkRoast;
import CoffeeType.Espresso;
import CoffeeType.SizeType;

/**
 * Created by zz on 2015/4/20.
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        DarkRoast darkRoast = new DarkRoast(SizeType.tall);
        Beverage b = new Decaf(SizeType.grande);

        System.out.print(b.cost());
    }

}
