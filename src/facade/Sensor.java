package facade;

/**
 * Created by hao.yan on 2015/10/20.
 */
public class Sensor {

    private int num;

    public Sensor(int num) {
        this.num = num;
    }

    public void open() {
        System.out.println("sensor " + num + " open");
    }

    public void close() {
        System.out.println("sensor " + num + " close");
    }
}
