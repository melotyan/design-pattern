package abstractfactory.product;

/**
 * Created by hao.yan on 2015/9/6.
 */
public abstract class Phone  {
    protected String name;

    protected Phone(String name) {
        this.name = name;
    }

    public abstract String getDescription();

}
