package builder;

/**
 * Created by hao.yan on 2015/9/2.
 */
public class Main {

    public static void main(String[] args) {
        Constructor constructor1 = new Constructor(new CarBuilder());
        Constructor constructor2 = new Constructor(new TruckBuilder());

        System.out.println(constructor1.getProduct());
        System.out.println(constructor2.getProduct());
    }
}
