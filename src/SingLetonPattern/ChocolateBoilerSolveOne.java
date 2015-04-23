package SingLetonPattern;

/**
 * Created by zz on 2015/4/23.
 */
//第一个例子，其中如果使用多线程，将会返回两个实例，单件模型失败
public class ChocolateBoilerSolveOne {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSolveOne chocolateBoiler;
    private ChocolateBoilerSolveOne(){
        empty = true;
        boiled = false;
        System.out.println("asfdasf");
    }

    public static ChocolateBoilerSolveOne getGetInstance() {
        if (chocolateBoiler==null){
            chocolateBoiler = new ChocolateBoilerSolveOne();
        }
        return chocolateBoiler;
    }
}
