package composite;

/**
 * Created by hao.yan on 2015/9/30.
 */
public abstract class Directory {
    protected String name;
    protected int size;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void add(Directory directory) {

    }

    public void printList() {
        printList("");
    }

    public abstract void printList(String prefix);


}
