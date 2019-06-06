package cn.jikexueyuan.proxymode.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 14:03
 **/
@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayHello() {
        return "hello world";
    }

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            LocateRegistry.createRegistry(6600);
            Naming.rebind("rmi://127.0.0.1:6600/RemoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
