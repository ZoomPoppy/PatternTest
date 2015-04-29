package StatePatternAndProxyPattern.Proxy;


import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;

/**
 * Created by zz on 2015/4/29.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says ,'hey'";
    }
    public static void main(String args[]){
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }


}


