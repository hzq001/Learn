package designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order: orderList) {
            order.execute();
        }
        orderList.clear();
    }


}
