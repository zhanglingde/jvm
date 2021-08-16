package class03.bytecode;

/**
 * synchronized 字节码
 */
public class Demo06_synchronized {

    public static void main(String[] args) {
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("ok");
        }
    }
}
