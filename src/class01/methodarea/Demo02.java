package class01.methodarea;

/**
 * StringTable [ "a", "b" ,"ab" ]
 * 底层结构 hashtable,固定容量不能扩容
 */
public class Demo02 {

    // 加载 .class 文件时，常量池中的信息会被加载到运行时常量池（字符串加载到 字符串常量池），a b ab 都是常量池中的符号，还没有变为 java 字符串对象
    public static void main(String[] args) {

        // 懒加载，在运行到这一行代码时，才把 a 符号变为 "a" 字符串对象
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";

        String s4 = s1 + s2; // new StringBuilder().append("a").append("b").toString()  new String("ab")
        String s5 = "a" + "b";  // javac 在编译期间的优化，结果已经在编译期确定为 ab

        System.out.println(s3 == s5);
    }
}
