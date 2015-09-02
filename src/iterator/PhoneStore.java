package iterator;

import java.util.Iterator;
import java.util.Vector;


public class PhoneStore {
    private Vector<Phone> phoneVector = new Vector<Phone>();

    public Vector<Phone> getPhoneVector() {
        return phoneVector;
    }

    public void addPhone(Phone phone) {
        phoneVector.add(phone);
    }

    public Iterator<Phone> iterator() {
        return new PhoneStoreIterator(this);
    }
}
