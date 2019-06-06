package cn.moshi.daili;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 13:58
 **/
public class Client {
    public static void main(String[] args) {
        /*Internet Proxy=new RouterProxy();
        Proxy.access("http://www.电影.com");
        Proxy.access("http://www.音乐.com");
        Proxy.access("http://www.学习.com");
        Proxy.access("http://www.工作.com");*/
        //访问外网，生成猫代理
        Internet internet = (Internet) Proxy.newProxyInstance(Modem.class.getClassLoader(), Modem.class.getInterfaces(),
                new KeywordFileter(new Modem()));

        internet.access("http://www.电影.com");
        internet.access("http://www.音乐.com");
        internet.access("http://www.学习.com");
        internet.access("http://www.工作.com");

        //访问内网（局域网），生成交换机代理
        Intranet intranet = (Intranet) Proxy.newProxyInstance(Switch.class.getClassLoader(), Switch.class.getInterfaces(),
                new KeywordFileter(new Switch()));
        intranet.fileAccess("\\\\192.168.1.2\\共享\\电影\\Ironhuman.mp4");
        intranet.fileAccess("\\\\192.168.1.2\\共享\\游戏\\Hero.exe");
        intranet.fileAccess("\\\\192.168.1.4\\shared\\java学习资料.zip");
        intranet.fileAccess("\\\\192.168.1.6\\java知音\\设计模式是什么鬼.doc");
    }
}
