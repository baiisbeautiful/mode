package cn.jikexueyuan.factorymode.pizzastore.pizza;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:28
 **/
public class NYPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("NYPepperPizza");
        System.out.println(name+" preparing");
    }
}
