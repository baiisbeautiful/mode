package cn.moshi.daili;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 14:13
 **/
public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网"+path);
    }
}
