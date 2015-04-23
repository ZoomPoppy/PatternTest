/**
 * Created by zz on 2015/4/17.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "asdfa";
        dough = "fa";
        sauce = "a";
        toppings.add("b");
    }

    @Override
    void cut() {
        System.out.println();
    }
}
