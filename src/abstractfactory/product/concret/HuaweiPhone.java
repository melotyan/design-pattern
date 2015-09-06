package abstractfactory.product.concret;

import abstractfactory.product.Phone;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class HuaweiPhone extends Phone {

    public HuaweiPhone(String name) {
        super(name);
    }
    @Override
    public String getDescription() {
        return "华为手机" + name;
    }
}
