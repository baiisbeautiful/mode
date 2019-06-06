package cn.jikexueyuan.factorymode.pizzastore.absfactory;

import cn.jikexueyuan.factorymode.pizzastore.pizza.*;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:35
 **/
public class NYFactory implements AbsFactory {
    Pizza pizza=null;
    @Override
    public Pizza CreatePizza(String ordertype) {
        if(ordertype.equals("cheese")){
            pizza=new NYCheesePizza();
        }else if (ordertype.equals("pepper")){
            pizza=new NYPepperPizza();
        }

        return pizza;
    }
}
