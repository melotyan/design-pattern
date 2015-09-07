package bridge.abstraction;

import bridge.implementor.Cpu;

/**
 * Created by hao.yan on 2015/9/7.
 */
public abstract class Computer {
    protected Cpu cpu;

    protected Computer(Cpu cpu) {
        this.cpu = cpu;
    }

    public abstract void display();
}
