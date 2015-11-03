package state.context;

import state.state.State;
import state.state.StateEnum;
import state.state.StateFactory;

/**
 * Created by hao.yan on 2015/11/2.
 */
public class GumballMachine {
    private State state;
    private int numberOfBall;
    private StateFactory stateFactory;

    public GumballMachine(int number) {
        numberOfBall = number;
        stateFactory = new StateFactory(this);
        if (numberOfBall > 0)
            setState(StateEnum.NO_MONEY);
        else
            setState(StateEnum.SOLD_OUT);
    }
    public State getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = stateFactory.getState(state);
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void enjectMoney() {
        state.enjectMoney();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void despense() {
        state.despense();
    }

    public void releaseBall() {
        System.out.println("release a ball");
        numberOfBall--;
    }

    public boolean hasBall() {
        return numberOfBall > 0;
    }
}
