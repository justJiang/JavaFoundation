package demos.foundation.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by JiAng on 2017/6/15.
 * collections、Arrays工具类的使用
 */
public class CollectionDemo {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        List<String> strList = Arrays.asList(arr);
        System.out.println(strList);
    }
}
