package demos.foundation.StringDemo;

/**
 * Created by JiAng on 2017/6/8.
 */
public class StringDemo {
    public static void main(String[] args) {
        /*String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2);  // true
        System.out.println(s1.equals(s2)); // true*/


        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3 == s2);
        System.out.println(s3.equals(s2));
    }

}
