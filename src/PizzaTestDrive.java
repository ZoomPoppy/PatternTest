/**
 * Created by zz on 2015/4/17.
 */
public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nypizza = new NYStylePizzaStore();
        Pizza pizza = nypizza.orderPizza("cheese");
        System.out.println("a order a "+pizza.getName()+"\n");
    }
}
