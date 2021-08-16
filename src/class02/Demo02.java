package class02;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示软引用
 * -Xmx20m -XX:+PrintGCDetails -verbose:gc
 */
public class Demo02 {

    private static final int _4MB = 4 * 1024 * 1024;

    // 使用强引用内存溢出
    public static void main(String[] args) throws IOException {
        // List<byte[]> list = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //
        //     list.add(new byte[_4MB]);
        // }
        // System.in.read();

        soft();
    }

    // 对于不重要的资源，使用软引用，在内存不够时可以释放内存，不会存在内存溢出
    public static void soft() {
        // list --> SoftReference --> byte[]

        List<SoftReference<byte[]>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SoftReference<byte[]> ref = new SoftReference<>(new byte[_4MB]);
            System.out.println(ref.get());
            list.add(ref);
            System.out.println(list.size());

        }
        System.out.println("循环结束：" + list.size());
        for (SoftReference<byte[]> ref : list) {
            System.out.println(ref.get());
        }
    }
}
