package class01.methodarea;

/**
 * 演示 StringTable 垃圾回收
 * -Xmx10m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails -verbose:gc
 * PrintStringTableStatistics：打印字符串表的统计信息，可以查看字符串池中字符串的个数
 * -XX:+PrintGCDetails -verbose:gc  打印垃圾回收的详细信息
 */
public class Demo05 {
    public static void main(String[] args) {
        int i = 0;
        try {
            // 修改 j 循环次数，查看日志字符串池中字符串的变化，到超出字符串池大小，查看是否垃圾回收
            for (int j = 0; j < 100000; j++) { // j=100, j=10000
                String.valueOf(j).intern();
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(i);
        }
    }
}
