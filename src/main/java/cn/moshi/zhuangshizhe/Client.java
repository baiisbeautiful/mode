package cn.moshi.zhuangshizhe;

import java.io.*;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 10:43
 **/
public class Client {
    public static void main(String[] args) {
        //用装饰器包裹女孩show出来
//        new Decorator(new Girl()).show();
        new Lipstick(new FoundationMakeup(new Girl())).show();
    }

    //java中的很多流处理类用到
    /**
     举个栗子
     new BufferedReader(new InputStream(new FileInputStream(filePath)));
     *
     */

}
