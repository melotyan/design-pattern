package observer.observer;

import observer.subject.News;
import observer.subject.Subject;

/**
 * Created by hao.yan on 2015/10/30.
 */
public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public void update(Subject subject) {
        System.out.println(subject.getState());
    }
}
