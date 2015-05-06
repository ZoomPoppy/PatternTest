package JavaRMI;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by zz on 2015/5/6.
 */
public class Entry {
    public static void main(String args[]) throws AlreadyBoundException,RemoteException{
        UserManagerImpl userManager = new UserManagerImpl();
        UserManagerInterface userManagerInterface  = (UserManagerInterface) UnicastRemoteObject.exportObject(userManager,0);
        Registry registry = LocateRegistry.createRegistry(2001);
        registry.rebind("userManager",userManagerInterface);
        System.out.println("server is ready");

    }
}
