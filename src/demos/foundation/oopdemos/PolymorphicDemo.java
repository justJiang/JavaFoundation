package demos.foundation.oopdemos;

/**
 * Created by JiAng on 2017/6/7.
 */
class A {
    public void show() {
        show2();
    }
    public void show2() {
        System.out.println("a");
    }
}
class B extends A {
    public void show2() {
        System.out.println("b");
    }
}
class C extends B {
    public void show() {
        super.show();
    }
    public void show2() {
        System.out.println("c");
    }
}


class PolymorphicTest {
    public static void main(String[] args) {
        A a = new B();
        a.show();       // b

        B b = new C();
        b.show();       // c
    }
}