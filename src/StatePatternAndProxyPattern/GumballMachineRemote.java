package StatePatternAndProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by zz on 2015/4/29.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
