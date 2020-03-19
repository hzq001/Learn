package designpattern.proxy.jdk;

/**
 * @author zq.huang
 * @date 2020/2/12
 */
public class Demo {

    public static void main(String[] args) {
        Liudehua liudehua = new Liudehua();
        StartProxy startProxy = new StartProxy();
        startProxy.setTarget(liudehua);

        Object startProxyObject = startProxy.createProxyObject();

        Start start = (Start) startProxyObject;
        start.dance("liudehua");
        start.sing("liudehua");
    }
}
