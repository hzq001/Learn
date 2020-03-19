package designpattern.factory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square:draw() method.");
    }
}
