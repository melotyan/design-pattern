package decorator;

/**
 * Created by hao.yan on 2015/10/8.
 */
public class StringDisplay extends Display {
    private String content;

    public StringDisplay(String content) {
        this.content = content;
    }

    public int getLength() {
        return content.length();
    }

    public String getContent() {
        return content;
    }
}
