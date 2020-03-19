package designpattern.chainofresponsibility;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:" + message);
    }
}
