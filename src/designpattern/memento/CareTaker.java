package designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
