package designpattern.abstractfactory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red:fill() method.");
    }
}
