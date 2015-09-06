package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.product.Pad;
import abstractfactory.product.Phone;

/**
 * Created by hao.yan on 2015/9/6.
 */
public class Main {
    public static void main(String[] args) {
        Factory huaweiFactory = Factory.getFactory("abstractfactory.factory.HuaweiFactory");
        Phone huaweiPhone = huaweiFactory.makePhone("p8");
        Pad huaweiPad = huaweiFactory.makePad("x1");
        System.out.println(huaweiPad.getDescription());
        System.out.println(huaweiPhone.getDescription());

        Factory xiaomiFactory = Factory.getFactory("abstractfactory.factory.XiaomiFactory");
        Phone xiaomiPhone = xiaomiFactory.makePhone("note");
        Pad xiaomiPad = xiaomiFactory.makePad("p1");
        System.out.println(xiaomiPad.getDescription());
        System.out.println(xiaomiPhone.getDescription());



    }

}

