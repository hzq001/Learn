package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/17
 */
public interface Item {

    public String name();

    public Packing packing();

    public float price();
}
