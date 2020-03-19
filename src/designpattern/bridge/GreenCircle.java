package designpattern.bridge;

/**
 * @author zq.huang
 * @date 2020/3/19
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color:green,radius:" + radius + ",x: " + x + ",y:" + y + "]");
    }
}
