package Behavior;

import Behavior.QuackBehavior;

/**
 * Created by zz on 2015/4/18.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
