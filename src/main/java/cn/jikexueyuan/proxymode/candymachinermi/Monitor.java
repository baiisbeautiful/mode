package cn.jikexueyuan.proxymode.candymachinermi;

import cn.jikexueyuan.proxymode.candymachine.CandyMachine;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 16:17
 **/
public class Monitor {
    private ArrayList<CandyMachineRemote> candyMachineRemotelst;
    public Monitor(){
        candyMachineRemotelst=new ArrayList<CandyMachineRemote>();
    }

    public void addMachine(CandyMachineRemote mCandyMachine){
        candyMachineRemotelst.add(mCandyMachine);
    }
    public void report(){
        CandyMachineRemote mCandyMachine;
        for (int i = 0; i < candyMachineRemotelst.size(); i++) {
            mCandyMachine=candyMachineRemotelst.get(i);
            try {
                System.out.println("Machine Loc:"+mCandyMachine.getLocation());
                System.out.println("Machine Candy count:"+mCandyMachine.getCount());
                System.out.println("Machine state:"+mCandyMachine.getState().getstatename());

            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
