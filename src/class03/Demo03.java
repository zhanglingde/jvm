package class03;

/**
 * 方法调用
 * 反编译 .class 查看方法调用指令
 */
public class Demo03 {

    public Demo03(){    }

    private void test1(){}

    private final void test2(){}

    public void test3(){}

    public static void test4(){}

    public static void main(String[] args) {
        Demo03 d = new Demo03();    // 构造方法
        d.test1();      // 私有方法
        d.test2();      // final
        d.test3();      // public
        d.test4();      // 对象调用静态方法
        Demo03.test4(); // 类调用静态方法

    }
}
