package designpattern.observer;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
