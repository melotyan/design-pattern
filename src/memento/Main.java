package memento;

import memento.game.Gamer;
import memento.game.Memento;

/**
 * Created by hao.yan on 2015/10/30.
 */
public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.keepSchdule();
        for (int i = 0; i < 30; i++) {
            System.out.print("当前步骤: " + i + ": ");
            System.out.println("状态：" + gamer.toString());
            gamer.bet();
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("赚钱了，先保存状态");
                memento = gamer.keepSchdule();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("亏损过多，回滚");
                gamer.undo(memento);
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
