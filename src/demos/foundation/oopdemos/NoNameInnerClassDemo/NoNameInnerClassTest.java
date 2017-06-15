package demos.foundation.oopdemos.NoNameInnerClassDemo;

/**
 * Created by JiAng on 2017/6/8.
 */
public class NoNameInnerClassTest {
    public void methodForNoNameInnerClass() {

        // 接口的实现并创建匿名对象
        // 实现了类或接口的子类匿名对象
        new Inter() {
            @Override
            public void method() {
                System.out.println("NoNameInnerClassMethod Run");
            }
        }.method();
    }
}

class Test {
    public static void main(String[] args) {
        new NoNameInnerClassTest().methodForNoNameInnerClass();
    }
}
