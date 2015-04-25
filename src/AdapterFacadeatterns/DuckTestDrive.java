package AdapterFacadeatterns;

import CoffeeType.Decaf;

/**
 * Created by zz on 2015/4/25.
 */
public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey say...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
