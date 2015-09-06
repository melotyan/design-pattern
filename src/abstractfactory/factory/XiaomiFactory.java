package abstractfactory.factory;

import abstractfactory.product.Cpu;
import abstractfactory.product.Glass;
import abstractfactory.product.Phone;
import abstractfactory.product.concret.CorningGlass;
import abstractfactory.product.concret.MiPhone;
import abstractfactory.product.concret.QualcommCpu;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class XiaomiFactory extends Factory {
    @Override
    public Phone makePhone(String version) {
        return new MiPhone("小米" + version);
    }

    @Override
    public Glass makeGlass(String version) {
        return new CorningGlass("康宁" + version);
    }

    @Override
    public Cpu makeCpu(String version) {
        return new QualcommCpu("高通骁龙" + version);
    }
}
