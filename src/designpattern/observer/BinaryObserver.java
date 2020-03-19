package designpattern.observer;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string: "+Integer.toBinaryString(subject.getState()));
    }
}
