package designpattern.abstractfactory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public  abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shapeType);
}
