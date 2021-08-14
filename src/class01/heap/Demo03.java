package class01.heap;

/**
 * @author zhangling  2021/8/13 12:12
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 演示查看对象个数 堆转储 dump
 * 查看堆中占用内存大的对象
 */
public class Demo03 {

    public static void main(String[] args) throws InterruptedException {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            students.add(new Student());
        }
        Thread.sleep(1000000000L);
    }
}
class Student {
    private byte[] big = new byte[1024*1024];
}
