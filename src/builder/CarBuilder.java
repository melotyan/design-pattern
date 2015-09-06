package builder;

/**
 * Created by hao.yan on 2015/9/2.
 */
public class CarBuilder implements Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void buildWheel() {
        sb.append("add 4 little wheels\n");
    }

    @Override
    public void buildDoor() {
        sb.append("add 4 little doors\n");
    }

    @Override
    public void buildWindow() {
        sb.append("add 4 little windows\n");
    }

    @Override
    public void buildEngine() {
        sb.append("add an gasoline enginee\n");
    }

    @Override
    public void buildSkylight() {
        sb.append("add a skylight\n");
    }

    @Override
    public String getProduct() {
        return sb.toString();
    }

}
