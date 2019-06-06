package cn.jikexueyuan.singletonmode;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 9:35
 **/
public class Singleton {
    private static Singleton uniqueInstance=null;
    private Singleton(){}

    public static Singleton newInstance(){
        if (uniqueInstance==null){
            synchronized (Singleton.class){
                if (uniqueInstance==null){

                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
