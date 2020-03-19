package designpattern.command;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 11;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + quantity + " ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + quantity + " ]sold ");
    }
}
