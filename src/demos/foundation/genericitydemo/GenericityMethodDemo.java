package demos.foundation.genericitydemo;

import demos.foundation.bean.Person;

/**
 * Created by JiAng on 2017/6/16.
 * 使用泛型前需先声明
 * 在类、接口和方法上均可声明
 * 在方法上使用泛型
 */
public class GenericityMethodDemo {

    public static void main(String[] args) {
        Person p = new Person("张三", 12);

        // 传入什么类型泛型即表示什么类型
        p.saySomething("abc");
        p.saySomething(1);
        p.saySomething(true);
        p.saySomething(p);
    }

    // 静态方法不能使用泛型
    // 当调用方法时才确定泛型类型，而静态方法在加载字节码时就会加载
    /*public <T> static void fun1() {

    }*/

}
