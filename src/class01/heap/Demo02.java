package class01.heap;

/**
 * 演示堆内存变化
 */
public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1...");
        Thread.sleep(30000);
        byte[] array = new byte[1024 * 1024 * 10]; // 10 Mb，堆内存增加 10M
        System.out.println("2...");
        Thread.sleep(20000);
        array = null;                           // 可以被垃圾回收
        System.gc();                            // 堆内存减少 10M
        System.out.println("3...");
        Thread.sleep(1000000L);
    }
}
