package templatemethod;

/**
 * Created by hao.yan on 2015/9/1.
 */
public class Main {
    public static void main(String[] args) {
        AbstractPhone phone1 = new IPhone4();
        AbstractPhone phone2 = new IPhone5();
        AbstractPhone phone3 = new IPhone6();

        phone1.display();
        phone2.display();
        phone3.display();
    }
}
