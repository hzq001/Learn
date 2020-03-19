package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
