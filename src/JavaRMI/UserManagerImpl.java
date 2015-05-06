package JavaRMI;

import java.rmi.RemoteException;

/**
 * Created by zz on 2015/5/6.
 */
public class UserManagerImpl implements UserManagerInterface {
    public UserManagerImpl() throws RemoteException{

    }
    private static final long serialVersionUID = -3111492742628447261L;
    @Override
    public String getUserName() throws RemoteException {
        return "Tommy lee";
    }

    @Override
    public Account getAdminAccount() throws RemoteException {
       Account account = new Account();
        account.setUsername("admin");
        account.setPassword("admin");
        return account;
    }
}
