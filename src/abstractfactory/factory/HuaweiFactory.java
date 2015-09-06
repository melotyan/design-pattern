package abstractfactory.factory;

import abstractfactory.product.Cpu;
import abstractfactory.product.Glass;
import abstractfactory.product.Phone;
import abstractfactory.product.concret.HourGlass;
import abstractfactory.product.concret.HuaweiPhone;
import abstractfactory.product.concret.KylinCpu;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class HuaweiFactory extends Factory {
    @Override
    public Phone makePhone(String version) {
        return new HuaweiPhone("华为" + version);
    }

}
