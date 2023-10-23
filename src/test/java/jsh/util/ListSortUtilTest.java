package jsh.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import util.ListSortUtil;

import java.util.List;

@SpringBootTest
public class ListSortUtilTest {

    @Test
    void dualPivotQuickSortTest() {

        List<Integer> list = List.of(5, 3, 7, 1, 9, 4, 6, 2, 8);
        List<Integer> sortedList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ListSortUtil.dualPivotQuickSort(list, 0, list.size() - 1);

        System.out.println(list.toString());

        Assertions.assertEquals(list, sortedList);
    }
}
