package designpattern.abstractfactory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue:fill() method.");
    }
}
