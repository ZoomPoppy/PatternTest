package FactoryPattern;

/**
 * Created by zz on 2015/4/17.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza creatPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
