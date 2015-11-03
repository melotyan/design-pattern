package statepattern.state;

import statepattern.context.GumballMachine;

/**
 * Created by hao.yan on 2015/11/2.
 */
public class StateFactory {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State soldOutState;

    public StateFactory(GumballMachine gumballMachine) {
        noMoneyState = new NoMoneyState(gumballMachine);
        hasMoneyState = new HasMoneyState(gumballMachine);
        soldOutState = new SoldOutState(gumballMachine);
        soldState = new SoldState(gumballMachine);
    }

    public State getState(StateEnum state) {
        switch (state) {
            case HAS_MONEY:
                return hasMoneyState;
            case NO_MONEY:
                return noMoneyState;
            case SOLD:
                return soldState;
            case SOLD_OUT:
                return soldOutState;
            default:
                return noMoneyState;
        }
    }
}
