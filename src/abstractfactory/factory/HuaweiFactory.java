package abstractfactory.factory;

import abstractfactory.product.Pad;
import abstractfactory.product.Phone;
import abstractfactory.product.concrete.HuaweiPad;
import abstractfactory.product.concrete.HuaweiPhone;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class HuaweiFactory extends Factory {
    @Override
    public Phone makePhone(String version) {
        return new HuaweiPhone(version);
    }

    @Override
    public Pad makePad(String version) {
        return new HuaweiPad(version);
    }

}
