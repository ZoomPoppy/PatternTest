package CommandPattern.RemoteObject;

/**
 * Created by zz on 2015/4/19.
 */
public class Light {
    public String type;
    public Light(String type){
        this.type = type;
    }
    public void on(){
        System.out.println(type+"Light is On");
    }
    public void off(){
        System.out.println(type+"Light is Off");
    }

}
