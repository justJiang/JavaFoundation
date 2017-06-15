package demos.foundation.loopdemo;

/**
 * Created by JiAng on 2017/6/5.
 */
public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;  // 结束循环
//                continue;   // 跳过本次循环，继续下次循环
            }
            System.out.println(i);
        }
    }
}
