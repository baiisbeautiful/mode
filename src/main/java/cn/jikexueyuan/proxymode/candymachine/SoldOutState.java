package cn.jikexueyuan.proxymode.candymachine;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 15:20
 **/
public class SoldOutState implements State{
    private transient CandyMachine mCandyMachine;
    public SoldOutState(CandyMachine mCandyMachine){
        this.mCandyMachine=mCandyMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("you can't insert coin,the machine sold out!");
    }

    @Override
    public void returnCoin() {
        System.out.println("you can't return,you haven't inserted a coin yet!");
    }

    @Override
    public void trunCrank() {
        System.out.println("you turned,but there are no candies!");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("***SoldOutState***");
    }

    @Override
    public String getstatename() {
        return "SoldOutState";
    }
}
