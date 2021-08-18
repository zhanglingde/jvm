package class04;

/**
 * 可见性
 */
public class Demo02 {

    // 加 volatile 关键字解决可见性问题
    volatile static boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while(run){
                // ....
                // while 循环中为空不会停下来，不为空可以停下来，println 方法有 synchronized，保证了可见性，线程从主存中读取数据
                // System.out.println(1);
            }
        });
        t.start();

        Thread.sleep(1000);
        run = false; // 线程t不会如预想的停下来
    }
}
