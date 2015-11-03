package state.state;

import state.context.GumballMachine;

/**
 * Created by hao.yan on 2015/11/2.
 */
public class NoMoneyState implements State {
    private GumballMachine gumballMachine;

    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("insert the money");
        gumballMachine.setState(StateEnum.HAS_MONEY);
    }

    @Override
    public void enjectMoney() {
        System.out.println("no money insert, no money enject");
    }

    @Override
    public void turnCrank() {
        System.out.println("turn the crank, nothing happen");
    }

    @Override
    public void despense() {
        System.out.println("pay first");
    }
}
