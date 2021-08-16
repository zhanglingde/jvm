package class03.candy;

/**
 * switch 枚举
 */
public class Candy7 {

    enum Sex{
        MALE,FEMALE
    }

    /**
     * 定义一个合成类（仅 jvm 使用，对我们不可见）
     * 用来映射枚举的 ordinal 与数组元素的关系
     * 枚举的 ordinal 表示枚举对象的序号，从 0 开始
     * 即 MALE 的 ordinal() = 0,FEMALE 的 ordinal() = 1
     */
    static class $MAP{
        // 数组大小即为枚举元素个数，里面存储 case 用来对比的数字
        static int[] map = new int[2];
        static{
            map[Sex.MALE.ordinal()] = 1;
            map[Sex.FEMALE.ordinal()] = 2;
        }
    }

    public static void foo(Sex sex) {
        int x = $MAP.map[sex.ordinal()];
        switch (x) {
            case 1:
                System.out.println("男");
                break;
            case 2:
                System.out.println("女");
                break;
        }
    }
}
