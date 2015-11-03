package statepattern.state;

import statepattern.context.GumballMachine;

/**
 * Created by hao.yan on 2015/11/2.
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertMoney() {
    }

    @Override
    public void enjectMoney() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void despense() {

    }
}
