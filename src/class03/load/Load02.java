package class03.load;

import java.io.IOException;

/**
 * 解析的含义
 * 使用 HSDB 工具查看类的内存，查看类C常量池中 d 的引用地址是符号还是直接内存地址
 */
public class Load02 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassLoader classloader = Load02.class.getClassLoader();
        // loadClass 方法不会导致类的解析和初始化
        Class<?> c = classloader.loadClass("class03.load.C");
        // new 会初始化类的加载，解析，初始化
        // new C();
        System.in.read();
    }
}

class C {
    // 使用 new 方式创建，C 对象的常量池中，d 引用会变为直接的内存地址，而不是常量池中的符号
    D d = new D();
}

class D {

}
