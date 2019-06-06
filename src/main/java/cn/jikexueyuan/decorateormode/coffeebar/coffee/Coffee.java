package cn.jikexueyuan.decorateormode.coffeebar.coffee;

import cn.jikexueyuan.decorateormode.Drink;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 15:52
 **/
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
