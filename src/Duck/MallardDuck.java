package Duck;

import Behavior.FlyWithWings;
import Behavior.Quack;

/**
 * Created by zz on 2015/4/18.
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.print("mallar Duck displau");
    }
}
