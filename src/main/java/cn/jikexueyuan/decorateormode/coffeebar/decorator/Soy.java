package cn.jikexueyuan.decorateormode.coffeebar.decorator;

import cn.jikexueyuan.decorateormode.Drink;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 16:05
 **/
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }
}
