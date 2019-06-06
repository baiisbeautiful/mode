package cn.jikexueyuan.proxymode.candymachine;

import java.rmi.RemoteException;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 15:48
 **/
public class SoldState implements State {
    private transient CandyMachine mCandyMachine;
    public SoldState(CandyMachine mCandyMachine){
        this.mCandyMachine=mCandyMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("please wait!we are giving you a candy!");

    }

    @Override
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");

    }

    @Override
    public void trunCrank() {
        System.out.println("we are giving you a candy,turning another get nothing,!");

    }

    @Override
    public void dispense() throws RemoteException {
        mCandyMachine.releaseCandy();
        if(mCandyMachine.getCount()>0){
            mCandyMachine.setState(mCandyMachine.mOnReadyState);
        }else {
            System.out.println("Oo,out of candies");
            mCandyMachine.setState(mCandyMachine.mSoldOutState);
        }
    }

    @Override
    public void printstate() {
        System.out.println("***SoldState***");

    }

    @Override
    public String getstatename() {
        return "SoldState";
    }
}
