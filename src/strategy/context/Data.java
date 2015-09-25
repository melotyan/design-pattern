package strategy.context;

import strategy.strategy.Sorter;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class Data {
    private Comparable[] data;
    private Sorter sorter;

    public Data(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void sort() {
        sorter.sort(data);
    }

    public void print() {
        for (Comparable e : data)
            System.out.print(e + ", ");
    }

}
