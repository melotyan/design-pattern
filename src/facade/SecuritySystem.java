package facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao.yan on 2015/10/20.
 */
public class SecuritySystem {
    private static List<Light> lightList = new ArrayList<Light>();
    private static List<Sensor> sensorList = new ArrayList<Sensor>();
    private static List<Camera> cameraList = new ArrayList<Camera>();

    static {
        for (int i = 0; i < 3; i++) {
            lightList.add(new Light(i));
            sensorList.add(new Sensor(i));
            cameraList.add(new Camera(i));
        }
    }

    public static void openSystem() {
        for (int i = 0; i < lightList.size(); i++)
            lightList.get(i).open();
        for (int i = 0; i < sensorList.size(); i++)
            sensorList.get(i).open();
        for (int i = 0; i < cameraList.size(); i++)
            cameraList.get(i).open();
    }

    public static void closeSystem() {
        for (int i = 0; i < cameraList.size(); i++)
            cameraList.get(i).close();
        for (int i = 0; i < sensorList.size(); i++)
            sensorList.get(i).close();
        for (int i = 0; i < lightList.size(); i++)
            lightList.get(i).close();
    }


}
