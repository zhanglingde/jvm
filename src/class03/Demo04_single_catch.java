package class03;

/**
 * 异常 多个 catch
 */
public class Demo04_single_catch {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = 10;
        } catch (ArithmeticException e) {
            i = 20;
        } catch (NullPointerException e) {
            i = 30;
        } catch (Exception e) {
            i = 40;
        }
    }
}
