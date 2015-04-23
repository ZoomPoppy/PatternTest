package CoffeeType;

/**
 * Created by zz on 2015/4/20.
 */
public class HouseBlend extends Beverage  {

    public HouseBlend(Enum size){
        this.size = size;
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return  .89;
    }
}
