package bridge;

import bridge.abstraction.Computer;
import bridge.abstraction.Dell;
import bridge.abstraction.Lenovo;
import bridge.implementor.AmdCpu;
import bridge.implementor.IntelCpu;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class Main {

    public static void main(String[] args) {
        Computer dell1 = new Dell(new AmdCpu());
        Computer dell2 = new Dell(new IntelCpu());

        Computer lenovo1 = new Lenovo(new AmdCpu());
        Computer lenovo2 = new Lenovo(new IntelCpu());

        dell1.display();
        dell2.display();
        lenovo1.display();
        lenovo2.display();

    }
}
