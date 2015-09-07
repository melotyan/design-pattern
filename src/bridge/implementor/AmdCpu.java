package bridge.implementor;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class AmdCpu implements Cpu {
    @Override
    public String getInfo() {
        return "Amd Cpu";
    }
}
