package templatemethod;

/**
 * Created by hao.yan on 2015/9/1.
 */
public abstract class AbstractPhone {

    public String getOwner() {
        return "apple company";
    }

    public abstract double getSize();

    public String getMeterial() {
        return "metal";
    }

    public abstract String getName();

    public void display() {
        System.out.println("company: " + getOwner());
        System.out.println("name: " + getName());
        System.out.println("size: " + getSize());
        System.out.println("meterial: " + getMeterial());
    }
}
