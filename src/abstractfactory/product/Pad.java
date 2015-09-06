package abstractfactory.product;

/**
 * Created by hao.yan on 2015/9/6.
 */
public abstract class Pad {
    protected String name;

    protected Pad(String name) {
        this.name = name;
    }

    public abstract String getDescription();
}
