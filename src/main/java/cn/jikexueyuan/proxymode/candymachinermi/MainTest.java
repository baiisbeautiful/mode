package cn.jikexueyuan.proxymode.candymachinermi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 16:28
 **/
public class MainTest {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        try {
            CandyMachineRemote mCandyMachine =
                    (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6600/test1");
            monitor.addMachine(mCandyMachine);
            mCandyMachine= (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6600/test2");
            monitor.addMachine(mCandyMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        monitor.report();
    }
}
