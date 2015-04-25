package AdapterFacadeatterns;

/**
 * Created by zz on 2015/4/25.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("i'm flying a short distance");
    }
}
