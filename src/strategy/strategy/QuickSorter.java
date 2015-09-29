package strategy.strategy;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class QuickSorter implements Sorter {

    @Override
    public void sort(Comparable[] num) {
        if (num == null || num.length <= 0)
            return;
        quickSort(num, 0, num.length - 1);
    }

    public void quickSort(Comparable[] num, int start, int end) {
        if (start < end) {
            int index = partition(num, start, end);
            quickSort(num, 0, index - 1);
            quickSort(num, index + 1, end);
        }
    }

    private int partition(Comparable[] num, int low, int high) {
        Comparable temp = num[low];
        while (low < high) {
            while (low < high && num[high].compareTo(temp) >= 0)
                high--;
            num[low] = num[high];

            while (low < high && num[low].compareTo(temp) <= 0)
                low++;
            num[high] = num[low];
        }
        num[low] = temp;
        return low;
    }
}
