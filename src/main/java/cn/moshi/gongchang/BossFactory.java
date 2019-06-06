package cn.moshi.gongchang;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/30 9:25
 **/
public class BossFactory implements Factory {

    @Override
    public Enemy create(int screenWith) {
        //boss应该出现在屏幕中央
        return new Boss(screenWith/2,0);
    }
}
