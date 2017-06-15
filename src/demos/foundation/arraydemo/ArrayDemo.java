package demos.foundation.arraydemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by JiAng on 2017/6/5.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 一维数组
//        fun1();
        /**
         * 数组工具类Arrays
         */
//        fun2();
        // 二维数组
        fun3();
    }

    public static void fun1() {
        Integer[] arr = {1,2,3,4,5};
        Integer max = null;
        for (Integer i : arr) {
            max = i;
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }


    public static void fun2() {
        Integer[] arr = {1,2,3,4,5};
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            if (o1 < 02) {
                return 1;
            } else if (o1 == o2) {
                return 0;
            } else {
                return -1;
            }
        });
        System.out.println(Arrays.toString(arr));
        // 返回指定值的索引
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);
        System.out.println(arr[index]);
    }

    /**
     * 二维数组
     */
    public static void fun3() {
        int[][] arr = {{1,2,3},{4,5,6}};
        // 求最值
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max = " + max);
        /*for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
            for (int j : i) {
                System.out.println(j);
            }
        }*/
    }
}
