package class03.bytecode;

import java.net.CacheRequest;

/**
 * 异常 try-catch
 */
public class Demo04_try_catch {
    public static void main(String[] args) {
        int i = 0;
        try{
            i = 10;
        } catch (Exception e){
            i = 20;
        }
    }
}
