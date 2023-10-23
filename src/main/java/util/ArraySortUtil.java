package util;

public class ArraySortUtil {

    public static void dualPivotQuickSort(int[] arr, int low, int high) {

        if (low < high) {
            int[] pivots = partition(arr, low, high);

            int pivot1 = pivots[0];
            int pivot2 = pivots[1];

            dualPivotQuickSort(arr, low, pivot1 - 1);
            dualPivotQuickSort(arr, pivot1 + 1, pivot2 - 1);
            dualPivotQuickSort(arr, pivot2 + 1, high);
        }
    }

    public static int[] partition(int[] arr, int low, int high) {
        if (arr[low] > arr[high]) {
            swap(arr, low, high);
        }

        int j = low + 1;
        int g = high - 1, k = low + 1, p = arr[low], q = arr[high];

        while (k <= g) {
            if (arr[k] < p) {
                swap(arr, k, j);
                j++;
            } else if (arr[k] >= q) {
                while (arr[g] > q && k < g)
                    g--;
                swap(arr, k, g);
                g--;

                if (arr[k] < p) {
                    swap(arr, k, j);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;

        swap(arr, low, j);
        swap(arr, high, g);

        return new int[]{j, g};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
