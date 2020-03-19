package designpattern.mediator;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class Demo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi! John");
        john.sendMessage("Hello! Robert");
    }
}
