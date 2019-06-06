package cn.moshi.zhuangshizhe;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 11:09
 **/
public class Lipstick extends Decorator {
    public Lipstick(Showable showable) {
        super(showable);
    }


    @Override
    public void show(){
        System.out.println("涂口红（");
        showable.show();
        System.out.println(")");
    }
}
