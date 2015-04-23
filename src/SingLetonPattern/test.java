package SingLetonPattern;

/**
 * Created by zz on 2015/4/23.
 */
public class test extends Thread {
    public static void  main(String[] args){
       test t1 = new test();
    test t2 = new test();
    t1.start();
    t2.start();
}
    public void run(){
        ChocolateBoilerSolveOne chocolateBoilerSolveOne = ChocolateBoilerSolveOne.getGetInstance();
    }
}
