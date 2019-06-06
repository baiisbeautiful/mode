package cn.jikexueyuan.factorymode.pizzastore.absfactory;

import cn.jikexueyuan.factorymode.pizzastore.pizza.LDCheesePizza;
import cn.jikexueyuan.factorymode.pizzastore.pizza.LDPepperPizza;
import cn.jikexueyuan.factorymode.pizzastore.pizza.Pizza;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:35
 **/
public class LDFactory implements AbsFactory {
    Pizza pizza=null;
    @Override
    public Pizza CreatePizza(String ordertype) {
        if(ordertype.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if (ordertype.equals("pepper")){
            pizza=new LDPepperPizza();
        }

        return pizza;
    }
}
