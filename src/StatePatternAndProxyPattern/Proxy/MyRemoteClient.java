package StatePatternAndProxyPattern.Proxy;

import java.net.MalformedURLException;
import java.rmi.*;

/**
 * Created by zz on 2015/4/29.
 */
public class MyRemoteClient {
    public static void main(String args[]){
        new MyRemoteClient().go();
    }
    public void go(){
        try{
            MyRemote service = (MyRemote) Naming.lookup( "rmi://127.0.0.1/RemoteHello");
            String s =service.sayHello();
        }catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
