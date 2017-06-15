package demos.foundation.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JiAng on 2017/6/15.
 */
public class LinkedListAndArrayListStructur {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);

        list2.add(3);
        list2.add(4);
        list2.addFirst(2);
        list2.addLast(5);
        list2.removeFirst();
        list2.removeLast();

        System.out.println(list1.get(0));
        System.out.println(list2);
    }
}
