package observer;

import observer.observer.Reader;
import observer.subject.News;
import observer.subject.Subject;

/**
 * Created by hao.yan on 2015/10/30.
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new News("今日头条");
        subject.setState("重大消息，全国将全面放开二胎");
        subject.addObserver(new Reader("Tom"));
        subject.addObserver(new Reader("Bob"));
        subject.notifyObserver();
    }
}
