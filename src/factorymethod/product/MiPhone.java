package factorymethod.product;

public class MiPhone extends CellPhone {

    public MiPhone(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name + ": android's ring");
    }

}
