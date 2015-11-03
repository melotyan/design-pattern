package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hao.yan on 2015/11/3.
 */
public class CharFactory {
    private Map<Character, Char> map = new HashMap<Character, Char>();

    public static CharFactory getInstance() {
        return Inner.instance;
    }


    static class Inner {
        private static CharFactory instance = new CharFactory();
    }

    public Char getChar(char ch, int x, int y) {
        if (map.containsKey(ch)) {
            Char result = map.get(ch);
            result.setX(x);
            result.setY(y);
            return result;
        }
        try {
            Class className = Class.forName("flyweight.Char" + ch);
            Char result = (Char) className.newInstance();
            map.put(ch, result);
            result.setX(x);
            result.setY(y);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
