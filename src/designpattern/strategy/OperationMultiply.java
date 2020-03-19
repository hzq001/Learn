package designpattern.strategy;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
