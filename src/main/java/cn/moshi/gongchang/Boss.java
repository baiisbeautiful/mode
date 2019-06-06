package cn.moshi.gongchang;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/30 9:23
 **/
public class Boss extends Enemy {
    public Boss(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("boss出现坐标"+x+","+y);
        System.out.println("Boss向玩家发起攻击");
    }
}
