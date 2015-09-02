package adapter;


import adapter.adaptee.PowerSource;
import adapter.adapter.PhoneCharger;
import adapter.target.Phone;

public class Main {
    public static void main(String[] args) {
        PowerSource powerSource = new PowerSource();
        Phone phone = new PhoneCharger(powerSource);

        System.out.println(phone.charge());
    }
}
