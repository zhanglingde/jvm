package class03.load;

import java.io.IOException;

/**
 * 验证类的初始化
 * 只执行其中一个注释，查看是否发生初始化
 */
public class Load03 {
    static {
        // 静态代码块执行了说明类被初始化
        System.out.println("main init");
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // 1. 静态常量不会触发初始化
        // System.out.println(B.b);
        // 2. 类对象.class 不会触发初始化
        // System.out.println(B.class);
        // 3. 创建该类的数组不会触发初始化
        // System.out.println(new B[0]);

        // 4. 不会初始化类 B，但会加载 B、A
        // ClassLoader cl = Thread.currentThread().getContextClassLoader();
        // cl.loadClass("class03.load.B");

        // 5. 不会初始化类 B，但会加载 B、A
        // ClassLoader c2 = Thread.currentThread().getContextClassLoader();
        // Class.forName("class03.load.B", false, c2);

        // System.in.read();

        // ========= 触发初始化操作 ===============

        // 1. 首次访问这个类的静态变量或静态方法时
        // System.out.println(A.a);

        // 2. 子类初始化，如果父类还没初始化，会引发父类初始化
        // System.out.println(B.c);

        // 3. 子类访问父类静态变量，只触发父类初始化
        // System.out.println(B.a);

        // 4. 会初始化类 B，并先初始化类 A
        Class.forName("class03.load.B");


    }
}

class A {
    static int a = 0;

    static {
        System.out.println("a init");
    }
}

class B extends A {
    final static double b = 5.0;
    static boolean c = false;

    static {
        System.out.println("b init");
    }
}
