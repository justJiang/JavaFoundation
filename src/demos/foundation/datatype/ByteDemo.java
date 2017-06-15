package demos.foundation.datatype;

/**
 * Created by JiAng on 2017/6/5.
 */
public class ByteDemo {
    public static void main(String[] args) {
        // byte,short,char -- int -- long -- float -- double
        /*byte 占一个字节 -128 到127
        short 占两个字 -2 ^ 15 ~2 ^ 15 - 1
        int 占四个字节 -2 ^ 31 ~2 ^ 31 - 1
        long 占八个字节 -2 ^ 63 ~2 ^ 63 - 1*/
        Byte b2 = -128;
        Byte b1 = 127;
//        error，运算前自动类型提升为int类型
//        Byte b3 = b1 + b2;
        int i = b1 + b2;
        System.out.println(i);
        // 另一种情况
        // 3和12都是常量，java的常量优化机制在编译期会检查
        byte b3 = 3 + 12;
        System.out.println(b3);
        fun1();
    }

    public static void fun1() {
        short s = 1;
//        s = s + 1;
        int i = s + 1;
        short s1 = 1;
        // +=的自动类型提升
        s1 += 1;
        System.out.println(i);
        System.out.println(s1);
    }
}
