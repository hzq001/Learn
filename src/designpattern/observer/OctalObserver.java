package designpattern.observer;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string: "+Integer.toOctalString(subject.getState()));
    }
}
