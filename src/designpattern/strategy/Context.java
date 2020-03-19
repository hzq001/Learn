package designpattern.strategy;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}
