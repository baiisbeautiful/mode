package cn.moshi.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 14:17
 **/
public class KeywordFileter implements InvocationHandler {
        private List<String> blackList= Arrays.asList("电影","游戏","音乐","小说");
        //被代理的真实对象，猫，交换机或是别的什么
        private Object origin;

    public KeywordFileter(Object origin) {
        this.origin = origin;//注入被代理对象
        System.out.println("开启关键字过滤模式");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //要被切入方法面之前的业务逻辑
        String arg = args[0].toString();
        for (String keyword : blackList) {
            if (arg.contains(keyword)){
                System.out.println("禁止访问"+arg);
                return null;
            }
        }
        //调用真实的被代理对象方法
        return method.invoke(origin,arg);
    }
}
