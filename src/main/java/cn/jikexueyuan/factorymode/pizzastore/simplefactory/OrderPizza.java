package cn.jikexueyuan.factorymode.pizzastore.simplefactory;

import cn.jikexueyuan.factorymode.pizzastore.pizza.*;
import javafx.beans.binding.When;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 13:05
 **/
public class OrderPizza {
    SimplePizzaFactory simplePizzaFactory;
    public OrderPizza(SimplePizzaFactory simplePizzaFactory ){
        setFactory(simplePizzaFactory);

    }

    private void setFactory(SimplePizzaFactory simplePizzaFactory) {
        Pizza pizza=null;
        String ordertype;
        this.simplePizzaFactory=simplePizzaFactory;
        do{
            ordertype=gettype();
            simplePizzaFactory.CreatePizza(ordertype);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }


        }while (true);
    }

    private String gettype() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            System.out.println("please input pizza type :");
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
