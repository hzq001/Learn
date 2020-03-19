package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq.huang
 * @date 2020/2/19
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:observers){
            observer.update();
        }
    }
}
