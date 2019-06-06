package cn.moshi.gongchang;

import java.util.Random;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/30 9:02
 **/
public class SimpleFactory implements Factory{
//    private int screenWith;
    private Random random=new Random();//随机数

   /* public SimpleFactory(int screenWith) {
        this.screenWith = screenWith;
        random=new Random();
    }*/

  /*  public Enemy create(String type){
        int x = random.nextInt(screenWith);
        Enemy enemy=null;
        switch (type){
            case "Airplain":
                enemy=new Airplain(x,0);
                break;
            case "Tank":
                enemy=new Tank(x,0);
                break;
        }
        return enemy;

    }*/

    @Override
    public Enemy create(int screenWith) {
        Enemy enemy=null;
        if(random.nextBoolean()){
            enemy=new Airplain(random.nextInt(screenWith),0);//实例化飞机
        }else {
            enemy=new Airplain(random.nextInt(screenWith),0);//实例化坦克

        }
        return enemy;
    }
}
