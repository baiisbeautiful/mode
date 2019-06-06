package cn.jikexueyuan.factorymode.pizzastore.simplefactory;

import cn.jikexueyuan.factorymode.pizzastore.pizza.CheesePizza;
import cn.jikexueyuan.factorymode.pizzastore.pizza.GreekPizza;
import cn.jikexueyuan.factorymode.pizzastore.pizza.PepperPizza;
import cn.jikexueyuan.factorymode.pizzastore.pizza.Pizza;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 13:28
 **/
public class SimplePizzaFactory {
    public Pizza CreatePizza(String ordertype){
        Pizza pizza=null;
        if (ordertype.equals("cheese")){
            pizza=new CheesePizza();
        }else if(ordertype.equals("greek")){
            pizza=new GreekPizza();
        }else if(ordertype.equals("pepper")){
            pizza=new PepperPizza();
        }
        return pizza;
    }
}
