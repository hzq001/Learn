package designpattern.bridge;

/**
 * @author zq.huang
 * @date 2020/3/19
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color:red,radius:" + radius + ",x: " + x + ",y:" + y + "]");
    }
}
