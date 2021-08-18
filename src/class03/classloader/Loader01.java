package class03.classloader;

/**
 * @author zhangling  2021/8/17 15:10
 */
public class Loader01 {
    public static void main(String[] args) {
        // 返回null 表示用的是BootstrapClassLoader
        System.out.println(String.class.getClassLoader());
        System.out.println(sun.awt.HKSCS.class.getClassLoader());
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        System.out.println(Loader01.class.getClassLoader());

        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader());
        System.out.println(Loader01.class.getClassLoader().getClass().getClassLoader());

        //System.out.println(new T006_MSBClassLoader().getParent());
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
