package abstractfactory.product.concret;

import abstractfactory.product.Phone;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class XiaomiPhone extends Phone {
    public XiaomiPhone(String name) {
        super(name);
    }

    public String getDescription() {
        return "小米手机" + name;
    }

}
