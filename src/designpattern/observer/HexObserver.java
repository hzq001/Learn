package designpattern.observer;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex string: " + Integer.toHexString(subject.getState()).toLowerCase());
    }
}
