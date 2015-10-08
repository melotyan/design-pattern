package decorator;

/**
 * Created by hao.yan on 2015/10/8.
 */
public class SideBorder extends Border {
    private char ch;

    public SideBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    public int getLength() {
        return 2 + display.getLength();
    }

    public String getContent() {
        return ch + display.getContent() + ch;
    }
}
