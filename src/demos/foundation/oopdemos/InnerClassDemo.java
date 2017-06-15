package demos.foundation.oopdemos;

/**
 * Created by JiAng on 2017/6/8.
 * 输出30,20,10
 */
class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(new Outer().num);
        }
    }
}

class InnerClassTest {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
