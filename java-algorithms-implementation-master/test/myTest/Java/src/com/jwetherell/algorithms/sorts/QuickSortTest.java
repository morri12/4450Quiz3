package src.com.jwetherell.algorithms.sorts;

import com.jwetherell.algorithms.sorts.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        for(int j = 0; j < 3; j++){
            QuickSort.PIVOT_TYPE type = QuickSort.PIVOT_TYPE.FIRST;
            if(j == 1){
                type = QuickSort.PIVOT_TYPE.MIDDLE;
            }else{
                type = QuickSort.PIVOT_TYPE.RANDOM;
            }
            assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, QuickSort.sort(type, new Integer[]{5, 3, 4, 1, 2}), Arrays.toString(QuickSort.sort(type, new Integer[]{5, 3, 4, 1, 2}))+ " " + type);
            Integer[] a = new Integer[1000];
            Integer[] b = new Integer[1000];
            for (int i = 0; i < 1000; i++) {
                a[i] = i;
            }

            for (int i = 0; i < 1000; i++) {
                b[i] = 999 - i;
            }
            assertArrayEquals(a, QuickSort.sort(type, b), Arrays.toString(QuickSort.sort(type, b))+ " " + type);
            assertArrayEquals(new Integer[]{}, QuickSort.sort(type, new Integer[]{}), Arrays.toString(QuickSort.sort(type, new Integer[]{}))+ " " + type);
            assertArrayEquals(new Integer[]{0, 0, 0, 0, 0}, QuickSort.sort(type, new Integer[]{0, 0, 0, 0, 0}), Arrays.toString(QuickSort.sort(type, new Integer[]{0, 0, 0, 0, 0}))+ " " + type);
            assertArrayEquals(new Integer[]{0}, QuickSort.sort(type, new Integer[]{0}), Arrays.toString(QuickSort.sort(type, new Integer[]{0}))+ " " + type);
        }
    }
}