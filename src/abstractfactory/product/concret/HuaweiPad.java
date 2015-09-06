package abstractfactory.product.concret;

import abstractfactory.product.Pad;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class HuaweiPad extends Pad {
    public HuaweiPad(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "华为平板" + name;
    }
}
