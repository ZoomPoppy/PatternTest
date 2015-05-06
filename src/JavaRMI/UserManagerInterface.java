package JavaRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by zz on 2015/5/6.
 */
public interface UserManagerInterface extends Remote {
    public String getUserName() throws RemoteException;
    public Account getAdminAccount() throws RemoteException;
}
