package composite;

/**
 * Created by hao.yan on 2015/9/30.
 */
public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder bin = new Folder("bin");
        Folder tmp = new Folder("tmp");
        Folder usr = new Folder("usr");

        bin.add(new File("vi", 20));
        bin.add(new File("latex", 500));

        Folder yuki = new Folder("yuki");
        Folder hanako = new Folder("hanako");
        Folder tomura = new Folder("tomura");
        yuki.add(new File("diary.html", 62));
        yuki.add(new File("Composite.java", 35));
        hanako.add(new File("memo.java", 45));
        tomura.add(new File("game.doc", 900));
        tomura.add(new File("junk.mail", 50));

        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomura);

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        root.printList();
        bin.printList();
        tmp.printList();
        usr.printList();


    }
}
