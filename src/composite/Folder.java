package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao.yan on 2015/9/30.
 */
public class Folder extends Directory {

    private List<Directory> list = new ArrayList<Directory>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Directory directory) {
        list.add(directory);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Directory directory : list) {
            size += directory.getSize();
        }
        return size;
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Directory directory : list) {
            directory.printList(prefix + "/" + name);
        }
    }

    public String toString() {
        return name + "(" + getSize() + ")";
    }
}
