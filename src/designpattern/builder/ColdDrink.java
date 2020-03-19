package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/17
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
