package class01.stack;

/**
 * 栈内存溢出  java.lang.StackOverflowError
 * -Xss256k
 */
public class Demo02 {
    private static int count;

    public static void main(String[] args) {
        try {
            method1();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }

    // 递归调用，没有退出，栈帧过多溢出
    private static void method1() {
        count++;
        method1();
    }
}
