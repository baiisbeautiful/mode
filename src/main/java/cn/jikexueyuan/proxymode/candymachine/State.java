package cn.jikexueyuan.proxymode.candymachine;

import java.io.Serializable;
import java.rmi.RemoteException;

public interface State extends Serializable{
    public void insertCoin();
    public void returnCoin();
    public void trunCrank();
    public void  dispense() throws RemoteException;
    public void printstate();
    public String getstatename();

}
