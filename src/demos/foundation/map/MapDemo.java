package demos.foundation.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by JiAng on 2017/6/16.
 * map集合的遍历方法
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        // 存储相同键是，替换值
        map.put(3, "d");
        
        // 获取键的set集合，遍历set集合根据键取出值
        fun1(map);

        // 使用键值对对象遍历
        fun2(map);
    }
    
    public static void fun1(Map<Integer, String> map) {
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println("key:" + key + ",value:" + map.get(key));
        }
    }

    public static void fun2(Map<Integer, String> map) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
    }
}

