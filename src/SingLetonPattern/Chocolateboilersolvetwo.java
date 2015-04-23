package SingLetonPattern;

/**
 * Created by zz on 2015/4/23.
 */
public class Chocolateboilersolvetwo {
    private boolean empty;
    private boolean boiled;
    private static Chocolateboilersolvetwo chocolateBoiler = new Chocolateboilersolvetwo();
    private Chocolateboilersolvetwo(){
        empty = true;
        boiled = false;
        System.out.println("asfdasf");

    }

    public static Chocolateboilersolvetwo getGetInstance() {
        return chocolateBoiler;
    }
}
