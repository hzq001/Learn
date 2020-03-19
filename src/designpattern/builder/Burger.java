package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/17
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
