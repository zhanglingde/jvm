package class02;

import java.util.ArrayList;

/**
 * 大对象直接晋升老年代
 */
public class Demo09 {
    private static final int _512KB = 512 * 1024;
    private static final int _1MB = 1024 * 1024;
    private static final int _6MB = 6 * 1024 * 1024;
    private static final int _7MB = 7 * 1024 * 1024;
    private static final int _8MB = 8 * 1024 * 1024;

    // -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
    // 设置堆内存大小为 20M，新生代为10M，伊甸园为 8M，幸存区为 1M，使用 UseSerialGC 垃圾回收器（幸存区比例不会动态调整）
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        // 新生代空间不够，直接晋升老年代，不会触发垃圾回收
        list.add(new byte[_8MB]);
        // 新生代和老年代内存都不够   java.lang.OutOfMemoryError: Java heap space
        list.add(new byte[_8MB]);
    }
}
