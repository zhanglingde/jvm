package class01.methodarea;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示 StringTable 位置
 * 在jdk8下设置 -Xmx10m -XX:-UseGCOverheadLimit（UseGCOverheadLimit）
 * 在jdk6下设置 -XX:MaxPermSize=10m
 */
public class Demo04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        try {
            for (int j = 0; j < 260000; j++) {
                // 往字符串池中添加对象，使其内存溢出，查看内存溢出位置
                list.add(String.valueOf(j).intern());
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(i);
        }
    }
}
