package demos.foundation.oopdemos;

/**
 * Created by JiAng on 2017/6/7.
 */
public class StaticDemo {
    public static void main(String[] args) {
//        Dog.id = 1;
        Dog dog = new Dog();

        Dog.id = 2;

        dog.wang();

        Dog dog1 = new Dog();
        dog1.id = 1;
        dog1.wang();
        dog.wang();

        System.out.println(Dog.id);             // 静态变量的值等于最后被赋值的值
    }
}
