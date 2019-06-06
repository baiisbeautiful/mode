package cn.jikexueyuan.decorateormode.coffeebar;

import cn.jikexueyuan.decorateormode.Drink;
import cn.jikexueyuan.decorateormode.coffeebar.coffee.Coffee;
import cn.jikexueyuan.decorateormode.coffeebar.coffee.Decaf;
import cn.jikexueyuan.decorateormode.coffeebar.coffee.Longblack;
import cn.jikexueyuan.decorateormode.coffeebar.decorator.Chocolate;
import cn.jikexueyuan.decorateormode.coffeebar.decorator.Milk;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 16:31
 **/
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order;
        order=new Decaf();
        System.out.println("order1 price "+order.cost());
        System.out.println("order1 desc "+order.getDescription());


        System.out.println("*****************************");
        order=new Longblack();
        order=new Milk(order);
        order=new Chocolate(order);
        order=new Chocolate(order);
        System.out.println("order2 price "+order.cost());
        System.out.println("order2 desc "+order.getDescription());
    }
}
