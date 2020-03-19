package designpattern.nullobject;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public class CustomerFactory {

    public static final String[] NAMES = {"Rob","Joe","Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : NAMES) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
