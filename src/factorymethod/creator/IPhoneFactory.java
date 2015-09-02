package factorymethod.creator;

import factorymethod.product.CellPhone;
import factorymethod.product.IPhone;


public class IPhoneFactory extends PhoneFactory {
    @Override
    public CellPhone createPhone(String version) {
        return new IPhone(version);
    }
}
