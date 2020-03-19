package designpattern.state;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
