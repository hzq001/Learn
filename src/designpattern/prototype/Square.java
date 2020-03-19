package designpattern.prototype;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Square extends Shape {
    public Square() {
        type="Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square:draw() method.");
    }
}
