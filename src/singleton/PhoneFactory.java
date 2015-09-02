package singleton;


public class PhoneFactory {
    private PhoneFactory() {
    }

    public static PhoneFactory getInstance() {
        return InlineClass.factory;
    }

    private static class InlineClass {
        private static PhoneFactory factory = new PhoneFactory();
    }
}
