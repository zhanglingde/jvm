package class03.load;

/**
 * 从字节码分析，使用 a,b,c 这三个常量是否会导致 类E 初始化
 */
public class Load04 {
    public static void main(String[] args) {
        System.out.println(E.a);
        System.out.println(E.b);
        System.out.println(E.c);

    }
}

class E {
    public static final int a = 10;
    public static final String b = "hello";
    public static final Integer c = 20;  // Integer.valueOf(20)
    static {
        System.out.println("init E");
    }
}
