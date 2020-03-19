package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
