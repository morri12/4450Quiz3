package src.com.jwetherell.algorithms.sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.jwetherell.algorithms.sorts.BubbleSort;

import java.util.Arrays;
import java.util.Random;

class BubbleSortTest {

    @Test
    void sort() {
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, BubbleSort.sort(new Integer[]{5, 3, 4, 1, 2}), Arrays.toString(BubbleSort.sort(new Integer[]{5, 3, 4, 1, 2}) ));
        Integer[] a = new Integer[1000];
        Integer[] b = new Integer[1000];
        for(int i = 0; i < 1000; i++){
            a[i] = i;
        }

        for (int i = 0; i < 1000; i++) {
            b[i] = 999-i;
        }
        assertArrayEquals(a, BubbleSort.sort(b), Arrays.toString(BubbleSort.sort(b) ));
        assertArrayEquals(new Integer[]{}, BubbleSort.sort(new Integer[]{}), Arrays.toString(BubbleSort.sort(new Integer[]{})));
        assertArrayEquals(new Integer[]{0,0,0,0,0}, BubbleSort.sort(new Integer[]{0,0,0,0,0}), Arrays.toString(BubbleSort.sort(new Integer[]{0,0,0,0,0})));
        assertArrayEquals(new Integer[]{0}, BubbleSort.sort(new Integer[]{0}), Arrays.toString(BubbleSort.sort(new Integer[]{0})));
    }
}