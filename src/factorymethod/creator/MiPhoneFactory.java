package factorymethod.creator;

import factorymethod.product.CellPhone;
import factorymethod.product.MiPhone;


public class MiPhoneFactory extends PhoneFactory{
    @Override
    public CellPhone createPhone(String version) {
        return new MiPhone(version);
    }
}
