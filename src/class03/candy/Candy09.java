package class03.candy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhangling  2021/8/16 20:46
 */
public class Candy09 {

    public Candy09() {

    }

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("d:\\1.txt");
            Throwable t = null;
            try {
                System.out.println(is);
            } catch (Throwable e1) {
                // t 是我们代码出现的异常
                t = e1;
                throw e1;
            }finally {
                // 资源不为空
                if (is != null) {
                    // 我们代码有异常
                    if (t != null) {
                        try {
                            is.close();
                        } catch (Throwable e2) {
                            // 如果 close 出现异常，作为被 压制异常 添加（关闭资源异常，和代码块中异常都存在）
                            t.addSuppressed(e2);
                        }
                    }
                } else {
                    // 如果我们代码没有异常，close 出现的异常就是最后 catch 块中的 e
                    is.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
