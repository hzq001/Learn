package designpattern.proxy.cglib;

/**
 * @author zq.huang
 * @date 2020/2/12
 */
public class Demo {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        Start start = (Start) cglibProxy.createProxyObject(Liudehua.class);
        start.dance("liudehua");
        start.sing("liudehua");
    }
}
