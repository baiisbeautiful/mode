package cn.jikexueyuan.factorymode.pizzastore.pizza;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:28
 **/
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDPepperPizza");
        System.out.println(name+" preparing");
    }
}
