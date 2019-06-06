package cn.jikexueyuan.factorymode.pizzastore.pizza;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:28
 **/
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDCheesePizza");
        System.out.println(name+" preparing");
    }
}
