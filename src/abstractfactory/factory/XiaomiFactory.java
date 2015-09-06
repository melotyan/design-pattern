package abstractfactory.factory;

import abstractfactory.product.Pad;
import abstractfactory.product.Phone;
import abstractfactory.product.concret.XiaomiPad;
import abstractfactory.product.concret.XiaomiPhone;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class XiaomiFactory extends Factory {
    @Override
    public Phone makePhone(String version) {
        return new XiaomiPhone(version);
    }

    @Override
    public Pad makePad(String version) {
        return new XiaomiPad(version);
    }
}
