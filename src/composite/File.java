package composite;

/**
 * Created by hao.yan on 2015/9/30.
 */
public class File extends Directory {

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    public String toString() {
        return name + "(" + size + ")";
    }
}
