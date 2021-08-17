package class03.load;

/**
 * 懒汉式 单例模式
 */
public class Load05 {
    public static void main(String[] args) {
        // 调用静态方法不会触发静态内部类的初始化
        Singleton.test();
        // 只有调用 getInstance 方法才会触发静态内部类加载、链接、初始化
        Singleton.getInstance();
    }
}

class Singleton{
    private Singleton(){

    }

    // 静态内部类可以访问外部类资源
    private static class LazyHolder{
        private static final Singleton SINGLETON = new Singleton();
        static {
            System.out.println("LazyHolder init...");
        }
    }
    // 不调用 该方法不会触发内部类加载，链接，初始化
    public static Singleton getInstance() {
        return LazyHolder.SINGLETON;
    }

    public static void test() {
        System.out.println("test");
    }

}
