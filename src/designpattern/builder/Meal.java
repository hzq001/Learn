package designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            String content = "Item: " + item.name()
                    + ", Packing: " + item.packing().pack()
                    + ", Price: " + item.price();
            System.out.println(content);
        }
    }

}
