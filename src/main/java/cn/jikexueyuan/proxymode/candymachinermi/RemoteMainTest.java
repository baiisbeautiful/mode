package cn.jikexueyuan.proxymode.candymachinermi;

import cn.jikexueyuan.proxymode.candymachine.CandyMachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 16:31
 **/
public class RemoteMainTest {
    public static void main(String[] args) {
        try {
            CandyMachine service = new CandyMachine("test1",7);
            LocateRegistry.createRegistry(6600);

            Naming.rebind("rmi://127.0.0.1:6600/test1",service);
            service.insertCoin();

            service= new CandyMachine("test2", 5);
            Naming.rebind("rmi://127.0.0.1:6600/test2",service);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
