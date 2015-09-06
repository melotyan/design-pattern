package builder;

/**
 * Created by hao.yan on 2015/9/2.
 */
public class TruckBuilder implements Builder {
    StringBuilder sb = new StringBuilder();

    @Override
    public void buildWheel() {
        sb.append("add 22 big wheels\n");
    }

    @Override
    public void buildDoor() {
        sb.append("add 2 big doors\n");
    }

    @Override
    public void buildWindow() {
        sb.append("add 2 big windows\n");
    }

    @Override
    public void buildSkylight() {
        sb.append("no skylight for truck\n");
    }

    @Override
    public void buildEngine() {
        sb.append("add 2 diesel engine\n");
    }

    @Override
    public String getProduct() {
        return sb.toString();
    }

}
