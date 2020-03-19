package designpattern.singleton.dcl;

/**
 * double-checked locking
 * todo 理解下
 *
 * @author zq.huang
 * @date 2020/2/21
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
