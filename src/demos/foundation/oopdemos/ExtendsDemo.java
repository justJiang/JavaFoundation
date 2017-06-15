package demos.foundation.oopdemos;

/**
 * Created by JiAng on 2017/6/7.
 */

class Fu {
    public int num = 10;

    public Fu() {
        System.out.println("fu");
    }
}

class Zi extends Fu {
    public int num = 20;

    public Zi() {
        System.out.println("zi");
    }

    public void show() {
        int num = 30;
        System.out.println(num);        // 就近原则
        System.out.println(this.num);   // 本类成员变量
        System.out.println(super.num);  // 父类成员变量
    }
}

class Test1_Extends {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

    /*
    输入结果：
    fu
    zi
    30
    20
    10
     */
