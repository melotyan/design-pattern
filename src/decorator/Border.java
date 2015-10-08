package decorator;

/**
 * Created by hao.yan on 2015/10/8.
 */
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
