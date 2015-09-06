package builder;

/**
 * Created by hao.yan on 2015/9/2.
 */
public interface Builder {
    public void buildWheel();
    public void buildEngine();
    public void buildDoor();
    public void buildWindow();
    public void buildSkylight();
    public String getProduct();
}
