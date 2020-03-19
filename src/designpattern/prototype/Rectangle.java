package designpattern.prototype;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
