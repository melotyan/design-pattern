package memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by hao.yan on 2015/10/30.
 */
public class Gamer {

    private int money;
    private List<String> fruits;
    private Random random = new Random();
    private String[] fruitArray = {"苹果", "香蕉", "西瓜", "橘子"};

    public Gamer(int money) {
        this.money = money;
        fruits = new ArrayList<String>();
    }

    public int getMoney() {
        return money;
    }

    public Memento keepSchdule() {
        Memento memento = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("好吃的"))
                memento.addFruit(fruit);
        }
        return memento;
    }

    public void undo(Memento memento) {
        money = memento.money;
        fruits = memento.fruits;
    }

    public void bet() {
        int num = random.nextInt(6) + 1;
        if (num == 1) {
            money += 100;
            System.out.println("加100块");
        } else if (num == 3) {
            money /= 2;
            System.out.println("金额减半");
        } else if (num == 6) {
            String fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获得水果:" + fruit);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("money:").append(money).append(" fruit:");
        for (String fruit :  fruits) {
            sb.append(fruit).append(" ");
        }
        return sb.toString();
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean())
            prefix = "好吃的";
        int n = random.nextInt(fruitArray.length);
        return prefix + fruitArray[n];
    }
}
