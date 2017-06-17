package demos.foundation.collection;

import demos.foundation.bean.Person;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by JiAng on 2017/6/15.
 * 演示set集合的唯一性特性
 * 先使用hashcode方法放回值，若一样，则不存储，若一样，则继续比较eqauls方法，不一样存储
 * 所以尽量让hashCode方法对不同的元素返回不同的值
 */
public class SetDemo {

    public static void main(String[] args) {

        // set集合实现元素唯一性的原理
//        fun1();

//        fun2();

        // TreeSet Demo
        // treeSet实现比较的原理：
        // comparable接口的caomparaTo方法
        // 可以通过两种方式实现：
        // 新建TreeSet时传入匿名子类对象(自然排序)
        // 自定义类实现Compatable接口，重写compataTo方法（比较器排序）
        // 比较器级别优先于自然排序
        fun3();
    }

    public static void fun1() {
        // String类已经重写了hashCode方法和equals方法
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("a");

        System.out.println(set);
    }

    public static void fun2() {
        Set<Person> set = new HashSet<>();
        System.out.println("1");
        set.add(new Person("a", 1));
        System.out.println("2");
        set.add(new Person("a", 1));
        System.out.println(3);
        set.add(new Person("b", 2));
        System.out.println(4);
        set.add(new Person("b", 2));
        System.out.println(5);
        set.add(new Person("c", 3));

        System.out.println(set);
    }

    public static void fun3() {
        Set<Integer> set = new TreeSet<>(((o1, o2) -> o2 - o1));
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);

        System.out.println(set);
    }
}
