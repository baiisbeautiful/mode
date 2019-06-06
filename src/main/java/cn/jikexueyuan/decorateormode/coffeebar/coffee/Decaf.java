package cn.jikexueyuan.decorateormode.coffeebar.coffee;

import cn.jikexueyuan.decorateormode.Drink;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 15:52
 **/
public class Decaf extends Coffee {
    public Decaf(){
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }
}
