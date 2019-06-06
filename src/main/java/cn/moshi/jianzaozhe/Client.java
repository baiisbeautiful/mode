package cn.moshi.jianzaozhe;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/30 10:51
 **/
public class Client {
    public static void main(String[] args) {
        //招工，建别墅
        Builder builder=new HouserBuilder();
        //交给工程总监
        Director director = new Director(builder);
        System.out.println(director.direct());
        //替换施工方，造公寓
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
