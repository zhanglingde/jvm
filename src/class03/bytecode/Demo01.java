package class03.bytecode;

/**
 * 构造方法 <cinit>()V
 */
public class Demo01 {

    static int i =10;
    static int a = 1;

    static {
        i = 20;

    }
    static {
        i = 30;
    }
}
