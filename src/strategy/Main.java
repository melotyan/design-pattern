package strategy;

import strategy.context.Data;
import strategy.strategy.MergeSorter;
import strategy.strategy.QuickSorter;
import strategy.strategy.Sorter;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class Main {
    public static void main(String[] args) {
        String str = "";
        String[] strArr = str.split(",");
        System.out.println("str is " + strArr[0]);

        Integer[] intData = {2, 5, 4, 2, 1, 46, 33, 22, 34, 56, 7, 26 };
        String[] strData = {"java", "c", "c++", "python", "php", "ruby", "shell", "C+", "js"};

        Data data1 = new Data(intData, new QuickSorter());
        Data data2 = new Data(strData, new MergeSorter());

        data1.sort();
        data1.print();
        data2.sort();
        data2.print();
    }
}
