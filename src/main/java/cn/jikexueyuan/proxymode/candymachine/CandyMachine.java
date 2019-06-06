package cn.jikexueyuan.proxymode.candymachine;

import cn.jikexueyuan.proxymode.candymachinermi.CandyMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 14:56
 **/
public class CandyMachine extends UnicastRemoteObject implements CandyMachineRemote {

    State mSoldOutState;
    State mOnReadyState;
    State mHasCoin;
    State mSoldState;
    State mWinnerState;
    private String locaton="";
    private State state;
    private int count=0;

    public CandyMachine(String location,int count)throws RemoteException{
        this.locaton=location;
        this.count=count;
        mSoldOutState=new SoldOutState(this);
        mOnReadyState=new OnReadyState(this);
        mHasCoin=new HasCoin(this);
        mSoldState=new SoldOutState(this);
        mWinnerState=new WinnerState(this);
        if (count>0){
            state=mOnReadyState;
        }else {
            state=mSoldOutState;
        }
    }
    @Override
    public String getLocation() throws RemoteException {
        return locaton;
    }
    public void setState(State state){
        this.state=state;
    }
    public void insertCoin(){
        state.insertCoin();
    }
    public void returnCoin(){
        state.returnCoin();
    }
    public void turnCrank() throws RemoteException {
        state.trunCrank();
        state.dispense();
    }
    void releaseCandy(){
        if(count>0){
            count=count-1;
            System.out.println("a candy rolling out!");
        }
    }
    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }

    public void printstate(){
        state.printstate();
    }
}
