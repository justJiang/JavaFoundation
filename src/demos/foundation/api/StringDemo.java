package demos.foundation.api;

/**
 * Created by JiAng on 2017/6/8.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "阿卡卡";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
