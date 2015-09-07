package bridge.abstraction;

import bridge.implementor.Cpu;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class Lenovo extends Computer {

    public Lenovo(Cpu cpu) {
        super(cpu);
    }

    @Override
    public void display() {
        System.out.println("搭载" + cpu.getInfo() + "的联想电脑");
    }
}
