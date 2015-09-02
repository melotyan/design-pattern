package prototype.client;

import prototype.prototype.Cake;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hao.yan on 2015/9/2.
 */
public class Cook {

    private Map<String, Cake> menu = new HashMap<String, Cake>();

    public void addToMenu(String name, Cake cake) {
        menu.put(name, cake);
    }

    public Cake makeCake(String name) {
        Cake cake = menu.get(name);
        return cake.cloneCake();
    }
}
