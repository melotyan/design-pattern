package proxy;

/**
 * Created by hao.yan on 2015/11/3.
 */
public class WineStore implements Shell {
    private String name;
    private Winery winery;

    public WineStore(String name) {
        this.name = name;
    }

    private void beforeShell() {
        System.out.println("准备工作");
    }

    @Override
    public void shell() {
        if (winery == null)
            winery = new Winery();
        beforeShell();
        winery.shell();
        afterShell();
    }

    private void afterShell() {
        System.out.println("收尾工作");
    }
}
