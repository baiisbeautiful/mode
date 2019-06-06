package cn.moshi.guanchazhe;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 13:18
 **/
public class PhoneFans extends Buyer {
    public PhoneFans(String name, Shop shop) {
        super(name, shop);//调用父类进行构造
    }

    @Override
    public void inform() {
        String product = shop.getProduct();
        if (product.contains("水果手机")){
            System.out.print(name);
            System.out.println("购买："+product);
        }
    }
}
