package cn.jikexueyuan.decorateormode.coffeebar.decorator;

import cn.jikexueyuan.decorateormode.Drink;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 16:05
 **/
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
