package cn.jikexueyuan.proxymode.rmi;


import java.rmi.Naming;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 14:10
 **/
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
