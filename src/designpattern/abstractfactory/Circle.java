package designpattern.abstractfactory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle:draw() method.");
    }
}
