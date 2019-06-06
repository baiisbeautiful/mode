package cn.jikexueyuan.factorymode.pizzastore.absfactory;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:56
 **/
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza;
        orderPizza=new OrderPizza(new LDFactory());

//        orderPizza=new OrderPizza(new NYFactory());
    }
}
