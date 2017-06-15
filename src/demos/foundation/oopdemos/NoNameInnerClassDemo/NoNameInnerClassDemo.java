package demos.foundation.oopdemos.NoNameInnerClassDemo;

/**
 * Created by JiAng on 2017/6/8.
 */
interface Inter1 {
    void show();
}

class Outer {
    public static Inter1 method() {
        return new Inter1() {
            public void show() {
                System.out.println("Hello World!");
            }
        };
    }
}


class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}
