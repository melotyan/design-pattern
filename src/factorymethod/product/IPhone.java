package factorymethod.product;


public class IPhone extends CellPhone {
    public IPhone(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name + ": apple's ring");
    }
}
