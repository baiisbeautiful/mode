package cn.jikexueyuan.decorateormode.coffeebar.decorator;

import cn.jikexueyuan.decorateormode.Drink;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 16:05
 **/
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
