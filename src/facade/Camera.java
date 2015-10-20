package facade;

/**
 * Created by hao.yan on 2015/10/20.
 */
public class Camera {
    private int num;

    public Camera(int num) {
        this.num = num;
    }

    public void open() {
        System.out.println("camera " + num + " open");
    }

    public void close() {
        System.out.println("camera " + num + " close");
    }

}
