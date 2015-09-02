package iterator;

import java.util.Iterator;
import java.util.Vector;


public class PhoneStoreIterator implements Iterator<Phone> {
    private PhoneStore phoneStore;

    public PhoneStoreIterator(PhoneStore phoneStore) {
        this.phoneStore = phoneStore;
    }
    @Override
    public boolean hasNext() {
        return !phoneStore.getPhoneVector().isEmpty();
    }

    @Override
    public Phone next() {
        Vector<Phone> vector = phoneStore.getPhoneVector();
        Phone phone = vector.get(0);
        vector.remove(0);
        return phone;
    }

    @Override
    public void remove() {
        phoneStore.getPhoneVector().remove(0);
    }

}
