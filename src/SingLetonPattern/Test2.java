package SingLetonPattern;

/**
 * Created by zz on 2015/4/23.
 */
//若使用第二种方法，将会在之前先建立一个实例，这样就不会产生两个实例，单件模式成功
    //但是 必须一定在调用方法前先实例化
public class Test2 extends  Thread {
    public static void  main(String[] args){
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();
        t1.start();
        t2.start();
    }
    public void run(){
        Chocolateboilersolvetwo chocolateBoilerSolveOne = Chocolateboilersolvetwo.getGetInstance();
    }

}
