package prototype;

import prototype.client.Cook;
import prototype.concreteprotype.ChocolateCake;
import prototype.concreteprotype.MilkCake;
import prototype.prototype.Cake;

/**
 * Created by hao.yan on 2015/9/2.
 */
public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.addToMenu("milk cake", new MilkCake());
        cook.addToMenu("chocolate cake", new ChocolateCake());

        Cake cake1 = cook.makeCake("milk cake");
        Cake cake2 = cook.makeCake("chocolate cake");
        cake1.displayFlavors();
        cake2.displayFlavors();
    }
}
