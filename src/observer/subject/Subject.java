package observer.subject;

import decorator.StringDisplay;
import observer.observer.Observer;

/**
 * Created by hao.yan on 2015/10/30.
 */
public abstract class Subject {
    protected String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public abstract void addObserver(Observer obServer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyObserver();
}
