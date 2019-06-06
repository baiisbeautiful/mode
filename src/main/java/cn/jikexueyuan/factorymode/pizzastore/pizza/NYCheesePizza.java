package cn.jikexueyuan.factorymode.pizzastore.pizza;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:31
 **/
public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
            super.setName("NYCheesePizza");
            System.out.println(name+" preparing");

    }
}
