package designpattern.state;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class EndState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "EndState{}";
    }
}
