package factorymethod.creator;

import factorymethod.product.CellPhone;


public abstract class PhoneFactory {
    public abstract CellPhone createPhone(String version);
}
