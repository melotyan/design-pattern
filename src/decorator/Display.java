package decorator;

/**
 * Created by hao.yan on 2015/10/8.
 */
public abstract class Display {
    public abstract int getLength();
    public abstract String getContent();
    public void show() {
        System.out.println(getContent());
    }
}
