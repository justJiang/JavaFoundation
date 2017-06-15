package demos.foundation.loopdemo;

import java.util.Random;

/**
 * Created by JiAng on 2017/6/5.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        fun1();
    }

    /**
     * switch
     */
    public static void fun1() {
        Random random = new Random();
        int i = random.nextInt(Season.values().length);
//        byte i = 1;  //OK short,char可以自动类型提升为int，所以都可以
//        String str = String.valueOf(i);   // jdk1.7后支持
        Season[] seasons = Season.values();
        Season season = seasons[i];
        switch (season) {
            case SPRING:
                System.out.println("春");
                // 没有break的穿透效果
                break;
            case SUNMER:
                System.out.println("夏");
                break;
            case FALL:
                System.out.println("秋");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}

