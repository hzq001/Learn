package designpattern.interpreter;

/**
 * @author zq.huang
 * @date 2020/2/14
 */
public class Demo {

    public static Expression getMaleExpression(){
        Expression robertExpression = new TerminalExpression("Robert");
        Expression johnExpression = new TerminalExpression("John");

        return new OrExpression(robertExpression,johnExpression);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julieExpression = new TerminalExpression("Julie");
        Expression marriedExpression = new TerminalExpression("Married");
        return new AndExpression(julieExpression,marriedExpression);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
