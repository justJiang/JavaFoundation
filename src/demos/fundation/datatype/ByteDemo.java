package demos.fundation.datatype;

/**
 * Created by JiAng on 2017/6/5.
 */
public class ByteDemo {
    public static void main(String[] args) {
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
    }
}
