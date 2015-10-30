package observer.subject;

import observer.observer.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao.yan on 2015/10/30.
 */
public class News extends Subject {
    List<Observer> observers = new ArrayList<Observer>();
    private String name;

    public News(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
