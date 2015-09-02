package factorymethod;

import factorymethod.creator.IPhoneFactory;
import factorymethod.creator.MiPhoneFactory;
import factorymethod.creator.PhoneFactory;
import factorymethod.product.CellPhone;


public class Main {
    public static void main(String[] args) {
        PhoneFactory factory1 = new IPhoneFactory();
        CellPhone phone1 = factory1.createPhone("iphone 6 plus");

        PhoneFactory factory2 = new MiPhoneFactory();
        CellPhone phone2 = factory2.createPhone("xiao mi 4");

        phone1.display();
        phone2.display();
    }
}
