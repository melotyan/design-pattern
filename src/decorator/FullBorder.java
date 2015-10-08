package decorator;

/**
 * Created by hao.yan on 2015/10/8.
 */
public class FullBorder extends Border {
    private char ch;

    public FullBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    public int getLength() {
        return 2 + display.getLength();
    }

    public String getContent() {
        StringBuilder sb = new StringBuilder();
        String line = makeLine();
        sb.append(line).append("\n");
        sb.append(ch).append(display.getContent()).append(ch).append("\n");
        sb.append(line);
        return sb.toString();
    }

    private String makeLine() {
        int count = getLength();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append(ch);
        return sb.toString();
    }
}
