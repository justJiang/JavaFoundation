package demos.foundation.oopdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by JiAng on 2017/6/7.
 */
public class IteratorDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

//        fun1();

//        fun2();

        // ListIterator新增add方法
        ListIterator<String> listIt = list.listIterator();
        while (listIt.hasNext()) {
            if (listIt.next().equals("b")) {
                listIt.add("rrr");
            }
//            listIt.add("d");
//            System.out.println(listIt.next());
        }

        System.out.println(list.toString());

        // 实现了Iteratble接口
        /*for (String str : list) {
            System.out.println(str);
        }*/
    }

    public static void fun1(List list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            // 不能有改变结构的操作
            // list.add("d");
        }
    }

    public static void fun2(List list) {
        ListIterator<String> listIt = list.listIterator();
        while (listIt.hasNext()) {
            listIt.add("d");
            System.out.println(listIt.next());
        }
    }
}
