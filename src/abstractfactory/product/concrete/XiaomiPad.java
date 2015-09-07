package abstractfactory.product.concrete;

import abstractfactory.product.Pad;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class XiaomiPad extends Pad {
    public XiaomiPad(String name) {
        super(name);
    }

    public String getDescription() {
        return "小米平板" + name;
    }

}
