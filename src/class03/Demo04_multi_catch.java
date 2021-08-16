package class03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 异常 multi-catch
 */
public class Demo04_multi_catch {
    public static void main(String[] args) {
        try {
            Method test = Demo04_multi_catch.class.getMethod("test");
            test.invoke(null);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void test() {
        System.out.println("ok");
    }
}
