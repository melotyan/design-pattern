package adapter.adapter;


import adapter.adaptee.PowerSource;
import adapter.target.Phone;

public class PhoneCharger extends Phone {
    private PowerSource powerSource;

    public PhoneCharger(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public String charge() {
        return powerSource.output() + "";
    }
}
