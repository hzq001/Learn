package designpattern.abstractfactory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle:draw() method.");
    }
}
