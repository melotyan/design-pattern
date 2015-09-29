package strategy.strategy;

import com.sun.org.apache.xml.internal.security.c14n.implementations.Canonicalizer20010315OmitComments;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by hao.yan on 2015/9/7.
 */
public class MergeSorter implements Sorter {

    @Override
    public void sort(Comparable[] num) {
        if (num == null || num.length <= 0)
            return;
        divide(num, 0, num.length - 1);
    }

    private void divide(Comparable[] num, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            divide(num, low, mid);
            divide(num, mid + 1, high);
            merge(num, low, mid, mid + 1, high);
        }
    }

    public void merge(Comparable[] num, int start1, int end1, int start2, int end2) {
        Comparable[] result = new Comparable[num.length];

        int i = start1, j = start2, k = start1;
        while (i <= end1 && j <= end2) {
            if (num[i].compareTo(num[j]) <= 0)
                result[k++] = num[i++];
            else
                result[k++] = num[j++];
        }
        while (i <= end1)
            result[k++] = num[i++];
        while (j <= end2)
            result[k++] = num[j++];

        while (start1 <= end2)
            num[start1] = result[start1++];
    }
}
