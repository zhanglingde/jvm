package class03.candy;

/**
 * 测试 addSuppressed 压制异常
 * 异常信息不会丢失
 */
public class Candy9_2 {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 实现 AutoCloseable 表示一个资源类
class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new Exception("close 异常");
    }
}
