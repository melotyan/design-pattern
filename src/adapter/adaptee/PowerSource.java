package adapter.adaptee;


public class PowerSource {
    private int voltage;

    public PowerSource() {
        voltage = 220;
    }

    public PowerSource(int voltage) {
        this.voltage = voltage;
    }

    public int output() {
        return voltage;
    }

}
