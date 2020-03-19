package designpattern.interpreter;

/**
 * @author zq.huang
 * @date 2020/2/14
 */
public class AndExpression implements Expression {

    private Expression expressionOne;
    private Expression expressionTwo;

    public AndExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean interpret(String context) {
        return expressionOne.interpret(context) && expressionTwo.interpret(context);
    }
}
