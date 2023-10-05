package WorkTwst;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 4, 8, 3, 1 };
        System.out.println(Arrays.toString(bubblesSort(arr)));
    }

    public static int[] bubblesSort(int[] array) {
        int len = array.length - 1;
        if (len > 1) {
            for (int i = 0; i < len; i++) {
                int temp = 0;
                for (int j = 0; j < len; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static int[] bubblesSort2(int[] array) {
        boolean isSorted = false;
        int temp;
        int len = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < len; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

}
