package class01.directmemory;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 直接内存分配释放的底层原理：Unsafe
 */
public class Demo03 {

    static int _1Gb = 1024 * 1024 * 1024;

    public static void main(String[] args) throws IOException {
        Unsafe unsafe = getUnsafe();
        // 分配内存 （base 表示内存地址，后续通过这个内存地址释放直接内存）
        long base = unsafe.allocateMemory(_1Gb);
        unsafe.setMemory(base, _1Gb, (byte) 0);
        System.out.println("分配完毕...");
        System.in.read();

        // freeMemory 释放内存
        unsafe.freeMemory(base);
        System.out.println("释放完毕...");
        System.in.read();
    }

    // 反射获取 Unsafe 对象
    public static Unsafe getUnsafe() {
        try {

            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            Unsafe unsafe = (Unsafe) f.get(null);
            return unsafe;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
