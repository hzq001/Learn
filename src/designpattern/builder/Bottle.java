package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/17
 */
public class   Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
