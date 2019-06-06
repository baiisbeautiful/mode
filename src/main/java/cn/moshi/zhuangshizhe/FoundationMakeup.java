package cn.moshi.zhuangshizhe;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 11:05
 **/
public class FoundationMakeup extends Decorator {

    public FoundationMakeup(Showable showable) {
        super(showable);//调用化妆品父类注入
    }

    @Override
    public void show(){
        System.out.println("打粉底（");
        showable.show();
        System.out.println(")");
    }
}
