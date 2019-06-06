package cn.jikexueyuan.factorymode.pizzastore.absfactory;

import cn.jikexueyuan.factorymode.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:43
 **/
public class OrderPizza {
    AbsFactory absFactory;
    String ordertype;
    private AbsFactory factory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory factory) {
        Pizza pizza=null;
        String ordertype;
        this.factory = factory;

        do{
            ordertype=gettype();
            pizza= factory.CreatePizza(ordertype);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);

    }


    private String gettype(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input pizzatype:");
            String str=strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
