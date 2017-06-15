package demos.foundation.oopdemos;

/**
 * Created by JiAng on 2017/6/7.
 */
class FuFu {
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块Fu");
    }

    public FuFu() {
        System.out.println("构造方法Fu");
    }
}

class ZiZi extends FuFu {
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public ZiZi() {
        System.out.println("构造方法Zi");
    }
}

class MainTest {
    public static void main(String[] args) {
        ZiZi ziZi = new ZiZi();
    }
}
    /**
     静态代码块Fu
     静态代码块Zi
     构造代码块Fu
     构造方法Fu
     构造代码块Zi
     构造方法Zi
     */
