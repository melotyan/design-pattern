package responsibility_chain;

/**
 * Created by hao.yan on 2015/10/19.
 */
public class Trouble {
    private int num;

    public Trouble(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        return "trouble " + num;
    }
}
