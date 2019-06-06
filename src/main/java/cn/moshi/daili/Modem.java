package cn.moshi.daili;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 13:44
 **/
public class Modem implements Internet {
    @Override
    public void access(String url) {
        System.out.println("正在访问"+url);
    }
}
