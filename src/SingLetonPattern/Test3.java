package SingLetonPattern;

/**
 * Created by zz on 2015/4/23.
 */
public class Test3 extends Thread{
    public static void  main(String[] args){
        Test3 t1 = new Test3();
        Test3 t2 = new Test3();
        t1.start();
        t2.start();
    }
    public void run(){
        ChocolateboilerSolverThree chocolateBoilerSolveOne = ChocolateboilerSolverThree.getInstance();
    }
}
