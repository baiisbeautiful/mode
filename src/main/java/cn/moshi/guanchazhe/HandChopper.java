package cn.moshi.guanchazhe;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 13:22
 **/
public class HandChopper extends Buyer {
    public HandChopper(String name, Shop shop) {
        super(name, shop);
    }

    @Override
    public void inform() {
        String product = shop.getProduct();
        System.out.print(name);
        System.out.println("购买："+product);
    }
}
