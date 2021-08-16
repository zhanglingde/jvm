package class02;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示GC Roots，使用 Memory Analyzer(MAT) 查看根对象
 */
public class Demo01 {

    public static void main(String[] args) throws Exception {
        List<Object> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        // 执行命令生成堆转储文件 jmap -dump:format=b,live,file=1.bin 21384（21384 进程id jps查看）
        System.out.println(1);
        System.in.read();

        list1 = null;
        // 执行命令生成堆转储文件 jmap -dump:format=b,live,file=2.bin 21384
        System.out.println(2);
        System.in.read();
        System.out.println("end...");
    }
}
