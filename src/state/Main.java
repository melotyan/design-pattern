package state;

import state.context.GumballMachine;

/**
 * Created by hao.yan on 2015/11/2.
 */
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.turnCrank();
        gumballMachine.insertMoney();
        gumballMachine.enjectMoney();
        gumballMachine.insertMoney();
        gumballMachine.turnCrank();
        gumballMachine.despense();
    }
}
