package cn.jikexueyuan.decorateormode.coffeebar.decorator;

import cn.jikexueyuan.decorateormode.Drink;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 16:06
 **/
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDescription(){
        return super.description+"-"+super.getPrice()+"&&"+obj.getDescription();
    }
}
