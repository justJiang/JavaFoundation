package demos.foundation.oopdemos;

/**
 * Created by JiAng on 2017/6/8.
 * JDK1.8新特性
 */
public interface DefaultDemo {

    // 默认修饰符public abstract
    void mehtod1();

    default void method2() {
        System.out.println("interface default method");
    }
}

class DefaultTest implements DefaultDemo {
    @Override
    public void mehtod1() {
        System.out.println("method1");
    }

    public static void main(String[] args) {
        DefaultDemo dd = new DefaultTest();
        dd.mehtod1();
        // default方法
        dd.method2();
    }
}

