package decorator;

/**
 * Created by hao.yan on 2015/10/8.
 */
public class Main {
    public static void main(String[] args) {
        Display display = new StringDisplay("hello world");
        display.show();

        FullBorder fullBorder = new FullBorder(display, '*');
        SideBorder sideBorder = new SideBorder(display, '#');

        fullBorder.show();
        sideBorder.show();
    }
}
