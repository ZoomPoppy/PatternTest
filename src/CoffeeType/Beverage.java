package CoffeeType;

/**
 * Created by zz on 2015/4/20.
 */
public abstract class Beverage {
    Enum size;
    String description = "Unkonwn Beverage";
    
    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void setSize(Enum size) {
        this.size = size;
    }

    public Enum getSize() {
        return size;
    }
}
