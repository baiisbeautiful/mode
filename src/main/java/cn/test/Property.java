package cn.test;

import java.util.Date;
import java.util.Properties;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/31 9:51
 **/
public class Property {

    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = "
                + rt.totalMemory()
                + " Free Memory = "
                + rt.freeMemory());
    }
}
