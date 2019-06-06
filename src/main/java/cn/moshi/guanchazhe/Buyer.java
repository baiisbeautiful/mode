package cn.moshi.guanchazhe;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 11:54
 **/
public abstract class Buyer {
    protected String name;//买家姓名
    protected Shop shop;//商店引用

    public Buyer(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }

    public abstract void inform();


    public void buy(){//买家购买商品
        System.out.println(name+"购买:");
        System.out.println(shop.getProduct());
    }
}
