package CoffeeType;

/**
 * Created by zz on 2015/4/20.
 */
public class Espresso extends Beverage{

    public Espresso(Enum size){
        this.size = size;
        description = "Espresso";
    }
    @Override
    public double cost()
    {
        return 1;
    }
}
