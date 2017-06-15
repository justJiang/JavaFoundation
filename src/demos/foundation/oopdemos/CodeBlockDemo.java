package demos.foundation.oopdemos;

/**
 * Created by JiAng on 2017/6/7.
 */
public class CodeBlockDemo {

    // 构造代码块
    {
        System.out.println("构造代码块");
    }

    // 静态代码块
    static {
        System.out.println("静态代码块");
    }

    public CodeBlockDemo() {
        System.out.println("构造方法");
    }
}

class CodeBlodeDemoMain {
    public static void main(String[] args) {
        CodeBlockDemo codeBlockDemo1 = new CodeBlockDemo();
        System.out.println("------------------------------");
        CodeBlockDemo codeBlodeDemo2 = new CodeBlockDemo();
    }
}
