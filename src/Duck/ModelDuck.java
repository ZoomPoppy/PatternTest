package Duck;

import Behavior.FlyNoWay;
import Behavior.Quack;

/**
 * Created by zz on 2015/4/18.
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i'm a model duck");
    }
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
