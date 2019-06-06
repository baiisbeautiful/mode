package cn.moshi.danli;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 11:22
 *
 * eagerload模式
 **/
public class God {
    private static final God god=new God();//自有永有的单例
    //保证别人不能创建类的实例
    private God(){}//构造方法私有化
    public static God getInstance(){//请神方法公开化
        return god;
    }
}
