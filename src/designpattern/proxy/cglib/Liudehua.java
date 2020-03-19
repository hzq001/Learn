package designpattern.proxy.cglib;

/**
 * @author zq.huang
 * @date 2020/2/12
 */
public class Liudehua implements Start {
    @Override
    public String sing(String name) {
        System.out.println(name+":给我一杯忘情水");
        return "唱完";
    }

    @Override
    public String dance(String name) {
        System.out.println(name+":开心的马骝");
        return "跳完";
    }
}
