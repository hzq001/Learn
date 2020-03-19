package designpattern.abstractfactory;

/**
 * @author zq.huang
 * @date 2020/2/24
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null){
            return  null;
        }

        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
