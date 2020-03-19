package designpattern.factory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("sss");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
