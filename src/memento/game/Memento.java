package memento.game;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao.yan on 2015/10/30.
 */
public class Memento extends Object {
    int money;
    List<String> fruits;

    Memento(int money) {
        this.money = money;
        fruits = new ArrayList<String>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }
}
