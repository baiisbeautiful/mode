package cn.moshi.danli;

import sun.security.jca.GetInstance;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 11:31
 * lazyload模式
 **/
public class God2 {
    private static God2 god2;
    private God2(){}
    //用synchronized关键字会造成时间的浪费（排队时间长）
    public static  God2 GetInstance(){
        if (god2==null){//头柱香未产生，抢香人进入堂内排队
            synchronized (God2.class){
                if (god2==null){//如果无神才造神
                    god2=new God2();
            }
        }

        }
        return god2;
    }
}
