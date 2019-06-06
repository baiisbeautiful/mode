package cn.moshi.daili;

import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 13:48
 **/
public class RouterProxy implements Internet {
    private Internet modem;//持有代理类被应用
    private List<String> blackList= Arrays.asList("电影","游戏","音乐","小说");

    public RouterProxy() {
        this.modem=new Modem();//实例化被代理类
        System.out.println("拨号上网。。。连接成功！");
    }

    @Override
    public void access(String url) {
        //同样实现互联网访问接口方法
        for (String keyword : blackList) {
            if (url.contains(keyword)){
                System.out.println("禁止访问"+url);
                return;
            }
        }
        modem.access(url);//正常访问互联网
    }
}
