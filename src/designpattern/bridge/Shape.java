package designpattern.bridge;

/**
 * @author zq.huang
 * @date 2020/3/19
 */
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
