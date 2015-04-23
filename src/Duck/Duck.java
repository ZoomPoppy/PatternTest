package Duck;

import Behavior.FlyBehavior;
import Behavior.QuackBehavior;

/**
 * Created by zz on 2015/4/18.
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public abstract void  display();

    public void performQuack(){ quackBehavior.quack();}

    public void swim(){ System.out.print("swim");}

    public void performFly(){  flyBehavior.fly();}

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
