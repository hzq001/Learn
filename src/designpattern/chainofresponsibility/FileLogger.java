package designpattern.chainofresponsibility;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger:" + message);
    }
}
