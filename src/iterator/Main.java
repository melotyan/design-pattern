package iterator;

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        PhoneStore phoneStore = new PhoneStore();
        phoneStore.addPhone(new Phone("iphone4"));
        phoneStore.addPhone(new Phone("iphone5"));
        phoneStore.addPhone(new Phone("iphone6"));

        Iterator<Phone> iterator = phoneStore.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
