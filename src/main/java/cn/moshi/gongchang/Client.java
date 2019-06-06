package cn.moshi.gongchang;

import java.util.Random;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/30 8:57
 *todo  其实注解本身就是一种工厂模式，spring已经帮你实现好了
 **/
public class Client {
    public static void main(String[] args) {
        /*int screenWith=100;//屏幕宽度
        System.out.println("游戏开始");
        Random random = new Random();//准备随机数

        int x = random.nextInt(screenWith);
        Enemy airplain = new Airplain(x, 0);
        airplain.show();

        x=random.nextInt(screenWith);
        Enemy tank = new Tank(x, 0);
        tank.show();*/
       /* System.out.println("游戏开始");
        SimpleFactory factory = new SimpleFactory(100);
        factory.create("Airplain").show();
        factory.create("Airplain").show();
        factory.create("Tank").show();*/
       int screenWith=100;
        System.out.println("游戏开始");
        Factory factory = new SimpleFactory();
        for (int i = 0; i < 10; i++) {
            factory.create(screenWith).show();
        }
        System.out.println("抵达关底");
        factory= new BossFactory();
        factory.create(screenWith).show();
    }
}
