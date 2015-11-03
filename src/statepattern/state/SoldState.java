package statepattern.state;

import statepattern.context.GumballMachine;

/**
 * Created by hao.yan on 2015/11/2.
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("please wait, we are giving you a ball");
    }

    @Override
    public void enjectMoney() {
        System.out.println("you have already turn the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turn twice won't give you more");
    }

    @Override
    public void despense() {
        gumballMachine.releaseBall();
        if (gumballMachine.hasBall()) {
            gumballMachine.setState(StateEnum.NO_MONEY);
        } else {
            gumballMachine.setState(StateEnum.SOLD_OUT);
        }
    }
}
