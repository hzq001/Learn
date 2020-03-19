package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
