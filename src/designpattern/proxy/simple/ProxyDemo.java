package designpattern.proxy.simple;

/**
 * @author zq.huang
 * @date 2020/2/12
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("demo.jpg");
        // need load
        image.display();
        System.out.println();
        // not need load
        image.display();
    }
}
