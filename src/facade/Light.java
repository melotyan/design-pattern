package facade;

/**
 * Created by hao.yan on 2015/10/20.
 */
public class Light {

    private int num;

    public Light(int num) {
        this.num = num;
    }

    public void open() {
        System.out.println("light " + num + " open");
    }

    public void close() {
        System.out.println("light " + num + " close");
    }
}
