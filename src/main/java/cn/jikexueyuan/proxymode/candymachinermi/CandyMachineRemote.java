package cn.jikexueyuan.proxymode.candymachinermi;

import cn.jikexueyuan.proxymode.candymachine.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CandyMachineRemote extends Remote {
    public String getLocation() throws RemoteException;
    public int  getCount() throws RemoteException;
    public State getState() throws RemoteException;
}
