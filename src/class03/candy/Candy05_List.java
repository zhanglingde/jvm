package class03.candy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhangling  2021/8/16 18:13
 */
public class Candy05_List {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer e = (Integer)it.next();
            System.out.println(e);
        }
    }
}
