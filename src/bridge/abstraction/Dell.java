package bridge.abstraction;

import bridge.implementor.Cpu;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class Dell extends Computer {

    public Dell(Cpu cpu) {
        super(cpu);
    }

    @Override
    public void display() {
        System.out.println("搭载" + cpu.getInfo() + "的戴尔电脑");
    }

    public void dd() {}
}
