package class01.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示堆内存溢出 java.lang.OutOfMemoryError: Java heap space
 * -Xmx8m
 */
public class Demo01 {

    public static void main(String[] args) {
        int i = 0;
        try {
            List list = new ArrayList<>();
            while (true) {
                byte[] bytes = new byte[1024 * 1024]; // 每new 一个对象，堆内存占用 1M
                list.add(bytes);
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
