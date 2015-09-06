package builder;

/**
 * Created by hao.yan on 2015/9/2.
 */
public class Constructor {
    private Builder builder;

    public Constructor(Builder builder) {
        this.builder = builder;
    }

    public String getProduct() {
        builder.buildDoor();
        builder.buildEngine();
        builder.buildSkylight();
        builder.buildWheel();
        builder.buildWindow();
        return builder.getProduct();
    }
}
