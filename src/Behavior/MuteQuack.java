package Behavior;

/**
 * Created by zz on 2015/4/18.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("i'm not quack ");
    }
}
