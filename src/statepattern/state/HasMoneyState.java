package statepattern.state;

import statepattern.context.GumballMachine;

/**
 * Created by hao.yan on 2015/11/2.
 */
public class HasMoneyState implements State {
    private GumballMachine gumballMachine;

    public HasMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertMoney() {
        System.out.println("you can't insert another money");
    }

    @Override
    public void enjectMoney() {
        System.out.println("success enject the money");
        gumballMachine.setState(StateEnum.NO_MONEY);
    }

    @Override
    public void turnCrank() {
        System.out.println("turn the crank");
        gumballMachine.setState(StateEnum.SOLD);
    }

    @Override
    public void despense() {
        System.out.println("nothing release");
    }
}
