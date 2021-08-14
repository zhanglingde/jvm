package class01.stack;

/**
 * 演示栈帧
 */
public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        // 方法一 入栈
        method1();
    }

    // 调用 method2 时入栈，调用完毕出栈
    private static void method1() {
        method2(1, 2);
    }

    private static int method2(int a, int b) {
        int c =  a + b;
        return c;
    }
}
