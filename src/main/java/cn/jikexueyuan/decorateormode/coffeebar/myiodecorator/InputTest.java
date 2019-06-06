package cn.jikexueyuan.decorateormode.coffeebar.myiodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 15:17
 **/
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(
                    new FileInputStream("G:\\picture\\test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
