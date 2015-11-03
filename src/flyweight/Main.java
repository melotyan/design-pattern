package flyweight;

/**
 * Created by hao.yan on 2015/11/3.
 */
public class Main {
    public static void main(String[] args) {
        CharFactory charFactory = CharFactory.getInstance();
        Char charA = charFactory.getChar('A', 0, 1);
        Char charB = charFactory.getChar('B', 1, 1);
        charA.display();
        charB.display();

        Char charA2 = charFactory.getChar('A', 2, 2);
        Char charB2 = charFactory.getChar('B', 3, 3);
        charA2.display();
        charB2.display();

        System.out.println(charA == charA2);
        System.out.println(charB == charB2);

    }

}
