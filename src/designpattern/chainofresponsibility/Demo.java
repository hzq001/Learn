package designpattern.chainofresponsibility;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public class Demo {

    /**
     * 构造日志链
     * @return 日志链
     */
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,"This is a info message.");
        System.out.println("==============================================");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug message.");
        System.out.println("==============================================");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is a error message.");

    }
}
