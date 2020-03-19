package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
