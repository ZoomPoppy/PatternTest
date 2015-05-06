package StatePatternAndProxyPattern.Proxy;

import java.rmi.*;
/**
 * Created by zz on 2015/4/29.
 */
//extends Remoteh是一个记号接口 表示此接口用来支持远程调用
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
