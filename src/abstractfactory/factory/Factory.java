package abstractfactory.factory;

import abstractfactory.product.Pad;
import abstractfactory.product.Phone;

/**
 * Created by hao.yan on 2015/9/6.
 */
public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Pad makePad(String version);
    public abstract Phone makePhone(String version);
}
