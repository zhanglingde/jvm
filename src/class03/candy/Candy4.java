package class03.candy;

/**
 * 可变参数
 */
public class Candy4 {
    public static void foo(String... args) {
        String[] arr = args;
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        foo("hello", "world");
    }
}
