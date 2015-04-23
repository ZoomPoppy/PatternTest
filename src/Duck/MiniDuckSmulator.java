package Duck;

import Duck.MallardDuck;
import Duck.Duck;
import Duck.ModelDuck;
/**
 * Created by zz on 2015/4/18.
 */
public class MiniDuckSmulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
    }
}
