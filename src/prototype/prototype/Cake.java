package prototype.prototype;

/**
 * Created by hao.yan on 2015/9/2.
 */
public abstract class Cake implements Cloneable {

    public abstract void displayFlavors();

    public Cake cloneCake() {
        Cake cake = null;
        try {
            cake = (Cake) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cake;
    }
}
