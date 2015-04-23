package Behavior;

import Behavior.FlyBehavior;

/**
 * Created by zz on 2015/4/18.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
