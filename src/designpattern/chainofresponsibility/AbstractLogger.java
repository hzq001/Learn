package designpattern.chainofresponsibility;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        // 判断是否输出信息
        if (this.level <= level) {
            write(message);
        }
        // 判断后续节点是否存在
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
