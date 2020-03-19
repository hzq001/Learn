package designpattern.nullobject;

/**
 * @author zq.huang
 * @date 2020/2/20
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "No available in customer database.";
    }
}
