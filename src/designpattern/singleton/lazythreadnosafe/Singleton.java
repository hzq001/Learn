package designpattern.singleton.lazythreadnosafe;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 延迟创建实例在需要的时候再进行创建
     * @return 实例
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
