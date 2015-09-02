package singleton;


public class Main {
    public static void main(String[] args) {
        PhoneFactory factory1 = PhoneFactory.getInstance();
        PhoneFactory factory2 = PhoneFactory.getInstance();
        System.out.println(factory1 == factory2);
    }
}
