package cn.moshi.zhuangshizhe;

import javax.sound.midi.Soundbank;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 10:38
 **/
public abstract class Decorator implements Showable {

    Showable showable;

    public Decorator(Showable showable) {//构造时注入这个家伙
        this.showable = showable;
    }



    @Override
    public void show() {
        /*System.out.println("粉饰（");//化妆品粉饰
        showable.show();//素面朝天
        System.out.println("）");//装饰打完收工*/
        showable.show();//直接调用不加任何修饰
    }
}
