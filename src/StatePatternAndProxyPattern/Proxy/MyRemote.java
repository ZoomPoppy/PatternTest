package StatePatternAndProxyPattern.Proxy;

import java.rmi.*;
/**
 * Created by zz on 2015/4/29.
 */
//extends Remoteh��һ���ǺŽӿ� ��ʾ�˽ӿ�����֧��Զ�̵���
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
