package cn.moshi.guanchazhe;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 11:57
 **/
public class Client {
    public static void main(String[] args) {
        Shop shop = new Shop();

        PhoneFans tangSir = new PhoneFans("果粉唐僧", shop);
        HandChopper baJeet = new HandChopper("剁手族八戒", shop);
        shop.register(tangSir);
        shop.register(baJeet);

        //商店到货
        shop.setProduct("猪肉炖粉条");
        shop.setProduct("水果手机【爱疯茶】");

       /* Buyer wukong=new Buyer("悟空",shop);
        Buyer bajie=new Buyer("八戒",shop);
        Buyer shaseng=new Buyer("沙僧",shop);

        wukong.buy();
        bajie.buy();
        shaseng.buy();
        bajie.buy();

        //师傅忍不住了，加入购买
        Buyer tangseng = new Buyer("唐僧", shop);
        tangseng.buy();

        //除了八戒其他人都放弃了
        bajie.buy();
        bajie.buy();

        //商店终于进货了
        shop.setProduct("最新旗舰版手机");
        bajie.buy();//八戒购买：最新旗舰版手机*/

    }
}
