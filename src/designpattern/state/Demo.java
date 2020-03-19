package designpattern.state;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        EndState endState = new EndState();
        endState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
