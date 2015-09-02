package templatemethod;

/**
 * Created by hao.yan on 2015/9/1.
 */
public class IPhone4 extends AbstractPhone {
    @Override
    public double getSize() {
        return 3.5;
    }

    @Override
    public String getName() {
        return "iphone4";
    }
}
