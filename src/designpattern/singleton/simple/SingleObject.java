package designpattern.singleton.simple;

/**
 * 简单单例
 * @author zq.huang
 * @date 2020/2/21
 */
public class SingleObject {
    /**
     * 创建静态实例
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 私有方法，使得无法在外部被创建
     */
    private SingleObject() {
    }

    /**
     * 静态方法获取实例
     *
     * @return 实例
     */
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world");
    }
}
