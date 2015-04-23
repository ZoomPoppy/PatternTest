package SingLetonPattern;

/**
 * Created by zz on 2015/4/23.
 */
public class ChocolateboilerSolverThree {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateboilerSolverThree chocolateboilerSolverThree;
    private ChocolateboilerSolverThree(){
        empty = true;
        boiled = false;
        System.out.println("asfdasf");

    }
    public static ChocolateboilerSolverThree getInstance(){
        if (chocolateboilerSolverThree ==null){
            synchronized (ChocolateboilerSolverThree.class){
                if (chocolateboilerSolverThree==null){
                    chocolateboilerSolverThree = new ChocolateboilerSolverThree();
                }
            }
        }
        return chocolateboilerSolverThree;
    }

}
