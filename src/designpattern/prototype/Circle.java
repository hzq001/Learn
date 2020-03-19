package designpattern.prototype;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle:draw() method.");
    }
}
