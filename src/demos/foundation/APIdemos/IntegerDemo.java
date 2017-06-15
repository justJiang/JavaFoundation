package demos.foundation.APIdemos;

/**
 * Created by JiAng on 2017/6/15.
 */
public class IntegerDemo {

    public static void main(String[] args) {
        fun1();
        System.out.println("------------------------------------");
        fun2();
        System.out.println("-----------------------------------");
        fun3();             // -128到127
        // 源代码中定义了Integer的缓存，范围从-128到127，在自动拆装箱时，之间的对象不会再被重新创建
    }

    public static void fun1() {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }

    public static void fun2() {
        Integer i1 = 97;
        Integer i2 = 97;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }

    public static void fun3() {
        Integer i1 = 129;
        Integer i2 = 129;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
