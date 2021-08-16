package class02;

import java.util.ArrayList;

/**
 * 演示 GC 分析
 */
public class Demo08 {
    private static final int _512KB = 512 * 1024;
    private static final int _1MB = 1024 * 1024;
    private static final int _6MB = 6 * 1024 * 1024;
    private static final int _7MB = 7 * 1024 * 1024;
    private static final int _8MB = 8 * 1024 * 1024;

    // -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
    // 设置堆内存大小为 20M，新生代为10M，伊甸园为 8M，幸存区为 1M，使用 UseSerialGC 垃圾回收器（幸存区比例不会动态调整）
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        // eden 添加 7M,触发一次垃圾回收，eden 中某些对象放入 from，然后 from 和 to 交换
        list.add(new byte[_7MB]);
        // 还是只触发一次垃圾回收，eden 区几乎被放满
        list.add(new byte[_512KB]);
        // 触发第二次垃圾回收，eden 不够用，有些对象直接进入老年代
        list.add(new byte[_512KB]);


    }
}
