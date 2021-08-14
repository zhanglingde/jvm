package class01.directmemory;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * 禁用显式回收对直接内存的影响
 * -XX:+DisableExplicitGC 该参数禁用显示垃圾回收，即 System.gc() 垃圾回收无效，直接内存只能使用 Unsafe 进行回收
 */
public class Demo04 {

    static int _1Gb = 1024 * 1024 * 1024;

    public static void main(String[] args) throws IOException {
        // alllocateDirect 中调用了 Unsafe 的 allocateMemory 方法分配直接内存
        // alllocateDirect 中 Cleaner虚引用 + Deallocator 回调调用Unsafe.freeMemory() 释放直接内存
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1Gb);
        System.out.println("分配完毕...");
        System.in.read();
        System.out.println("开始释放...");
        byteBuffer = null;
        // Cleaner 所关联的对象 byteBuffer 被垃圾回收掉时，触发 Cleaner.clear方法，执行Deallocator中的 run方法，调用Unsafe.freeMemory() 释放直接内存
        System.gc(); // 显式的垃圾回收，Full GC
        System.in.read();
    }
}
