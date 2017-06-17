package demos.foundation.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by JiAng on 2017/6/16.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("ccc");
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ddd");

        // 使用TreeSet去重并排序
        Set<String> set = new TreeSet<>(String::compareTo);

        set.addAll(list);
        List<String> newList = new ArrayList<>();
        newList.addAll(set);
        set.clear();
        System.out.println(newList);
    }
}
