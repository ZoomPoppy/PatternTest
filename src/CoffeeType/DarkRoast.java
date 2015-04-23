package CoffeeType;

/**
 * Created by zz on 2015/4/20.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(Enum size){
        description = "DarkRoast Coffee";
        this.size = size;
    }


    @Override
    public double cost() {
        if (size == SizeType.tall){
            return 1.2;
        }
        if (size == SizeType.grande){
            return 1.8;
        }
        if (size == SizeType.venti)
        {
            return  2.4;
        }
        System.out.print("error");
        return 0;
    }


}
