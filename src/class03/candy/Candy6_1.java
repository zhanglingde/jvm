package class03.candy;

import java.util.WeakHashMap;

/**
 * @author zhangling  2021/8/16 20:18
 */
public class Candy6_1 {
    public static void choose(String str) {
        byte x = -1;
        switch (str.hashCode()){
            case 99162322:  // hello 的 hashCode，使用hashCode 提高判断的速度
                if (str.equals("hello")) {      // 再次 equeals 比较字符串是解决 hashCode 重复问题
                    x = 0;
                }
                break;
            case 113318802: // world 的 hashCode
                if (str.equals("world")) {
                    x = 1;
                }
        }
        // 转换成两个 switch
        switch (x) {
            case 0:
                System.out.println("h");
                break;
            case 1:
                System.out.println("w");
        }
    }
}
