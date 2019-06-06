package cn.moshi.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 11:51
 **/
public class Shop {
    private String product;//商品
    private List<Buyer> buyers;//持有买家的引用

    //初始商店无货
    public Shop(){
        this.product="无商品";
        this.buyers=new ArrayList<>();
    }

    //为了主动通知买家，买家得来到店里注册
    public void register(Buyer buyer){
        this.buyers.add(buyer);
    }

    //商店出货
    public String getProduct() {
        return product;
    }
    //商店入货
    public void setProduct(String product) {
        this.product = product;
        notifyBuyers();
    }
    //通知所有注册买家
    public void notifyBuyers() {
        buyers.stream().forEach(b->b.inform());
    }
}
