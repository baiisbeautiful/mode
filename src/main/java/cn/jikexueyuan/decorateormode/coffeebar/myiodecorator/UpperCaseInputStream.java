package cn.jikexueyuan.decorateormode.coffeebar.myiodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 15:04
 **/
public class UpperCaseInputStream extends FilterInputStream{

    protected UpperCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c==-1?c:Character.toUpperCase((char)(c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = 0; i < result; i++) {
            b[i]= (byte) Character.toUpperCase((char)b[i]);
        }
        return result;
    }
}
