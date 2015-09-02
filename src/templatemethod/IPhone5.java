package templatemethod;

/**
 * Created by hao.yan on 2015/9/1.
 */
public class IPhone5 extends AbstractPhone {
    @Override
    public double getSize() {
        return 4.0;
    }

    @Override
    public String getName() {
        return "iphone5";
    }
}
