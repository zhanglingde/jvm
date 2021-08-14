package class01.methodarea;

/**
 * @author zhangling  2021/8/13 21:53
 */
public class Demo03 {
    //  ["ab", "a", "b"]
    public static void main(String[] args) {

        String x = "ab";
        // 堆  new String("a") + new String("b") = StringBuilder().append(a).append(b).toString() = new String("ab")
        String s = new String("a") + new String("b");

        String s2 = s.intern(); // 将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池， 会把串池中的对象返回

        System.out.println( s2 == x);               // true
        System.out.println( s == x );               // false
    }
}
