package util;

import java.util.List;

public class ListSortUtil {

    public static void dualPivotQuickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int[] pivots = partition(list, low, high);

            int pivot1 = pivots[0];
            int pivot2 = pivots[1];

            dualPivotQuickSort(list, low, pivot1 - 1);
            dualPivotQuickSort(list, pivot1 + 1, pivot2 - 1);
            dualPivotQuickSort(list, pivot2 + 1, high);
        }
    }

    public static int[] partition(List<Integer> list, int low, int high) {
        if (list.get(low) > list.get(high)) {
            swap(list, low, high);
        }

        int j = low + 1;
        int g = high - 1, k = low + 1, p = list.get(low), q = list.get(high);

        while (k <= g) {
            if (list.get(k) < p) {
                swap(list, k, j);
                j++;
            } else if (list.get(k) >= q) {
                while (list.get(g) > q && k < g)
                    g--;
                swap(list, k, g);
                g--;

                if (list.get(k) < p) {
                    swap(list, k, j);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;

        swap(list, low, j);
        swap(list, high, g);

        return new int[]{j, g};
    }

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
