package cn.jikexueyuan.factorymode.pizzastore.simplefactory;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 13:33
 **/
public class PizzaStore{
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory;
        OrderPizza orderPizza;
        orderPizza=new OrderPizza(new SimplePizzaFactory());
    }
}
