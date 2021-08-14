package class01.methodarea;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 演示串池大小对性能的影响
 * -Xms500m -Xmx500m -XX:+PrintStringTableStatistics -XX:StringTableSize=1009
 *
 * 通过 StringTableSize 修改字符串池桶的个数，查看效率对比
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        // 读取 linux 单词字典（47万个字符串），将其存储字符串池中
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("linux.words"), "utf-8"))) {
            String line = null;
            long start = System.nanoTime();
            while (true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                line.intern();
            }
            System.out.println("cost:" + (System.nanoTime() - start) / 1000000);
        }
    }
}
