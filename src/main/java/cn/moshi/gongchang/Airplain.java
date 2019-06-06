package cn.moshi.gongchang;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/29 18:03
 **/
public class Airplain extends Enemy {
    //调用父类构造子初始化坐标
    public Airplain(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("飞机出现坐标:"+x+","+y);
        System.out.println("飞机向玩家发起攻击.....");
    }
}
