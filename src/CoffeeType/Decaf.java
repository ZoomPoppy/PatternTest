package CoffeeType;

/**
 * Created by zz on 2015/4/20.
 */
public class Decaf extends Beverage{
    public Decaf(Enum size){
        this.size = size;
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 2;
    }
}
