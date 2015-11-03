package flyweight;

import javax.swing.text.Position;

/**
 * Created by hao.yan on 2015/11/3.
 */
public class Char {
    protected int size;
    protected char symbol;
    protected String font;
    protected int x, y;

    public void display() {
        System.out.println("symbol: " + symbol + " size: " + size + " font: " + font + " position(" + x + "," + y + ")");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
