package class03.candy;

/**
 * 自动拆装箱
 */
public class Candy02 {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(1);  // 装箱
        int y = x.intValue();           // 拆箱
    }
}
