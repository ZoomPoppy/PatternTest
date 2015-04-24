package CommandPattern.RemoteObject;

/**
 * Created by zz on 2015/4/24.
 */
public class Stereo {
    public void on(){System.out.println("stereo on");}
    public void off(){System.out.println("Stereo off");}
    public void  setCd(){System.out.println("Stereo setCd");}
    public void setDvd(){System.out.println("Stereo setDvd");}
    public void setRadio(){System.out.println("Stereo setRadio");}
    public void setVolume(int volume){System.out.println("Stereo volume is "+volume);}

}
