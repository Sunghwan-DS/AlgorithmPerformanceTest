package jsh.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import util.ArraySortUtil;

@SpringBootTest
public class ArraySortUtilTest {

    @Test
    void dualPivotQuickSortTest() {

        int[] arr = {5, 3, 7, 1, 9, 4, 6, 2, 8};
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArraySortUtil.dualPivotQuickSort(arr, 0, arr.length - 1);

        Assertions.assertArrayEquals(arr, sortedArr);
    }
}
