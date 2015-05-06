package JavaRMI.Client;

import JavaRMI.UserManagerInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by zz on 2015/5/6.
 */
//客户端必须等服务启动之才能用
public class Entry2 {
    public static void main(String args[]){
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",2001);
            UserManagerInterface userManager = (UserManagerInterface)registry.lookup("userManager");
            System.out.println(" "+userManager.getAdminAccount().getUsername()+userManager.getAdminAccount().getPassword());

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
