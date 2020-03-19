package designpattern.interpreter;

/**
 * @author zq.huang
 * @date 2020/2/14
 */
public class OrExpression implements Expression {

    private Expression expressionOne;
    private Expression expressionTwo;

    public OrExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean interpret(String context) {
        return expressionOne.interpret(context) || expressionTwo.interpret(context);
    }
}
