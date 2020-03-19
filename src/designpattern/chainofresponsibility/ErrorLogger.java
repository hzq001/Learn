package designpattern.chainofresponsibility;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger:"+message);
    }
}
