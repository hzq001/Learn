package designpattern.singleton.lazythreadsafe;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 加锁，影响效率
     * @return 实例
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
