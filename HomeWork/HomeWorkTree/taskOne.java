package HomeWork.HomeWorkTree;

import java.util.Arrays;

/*
 Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
 Пример: a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
public class taskOne {
    public static void main(String[] args) {
        int[] a = new int[] { 5, 1, 6, 2, 3, 4 };
        System.out.println(Arrays.toString(a));
        int[] b = MergeSort.mergeSort(a);
        System.out.println(Arrays.toString(b));
    }

    class MergeSort {

        public static int[] mergeSort(int[] a) {
            // Напишите свое решение ниже
            if (a.length < 2) {
                return a;
            }
            int midl = a.length / 2;
            int[] left = new int[midl];
            int[] right = new int[a.length - midl];

            for (int i = 0; i < midl; i++) {
                left[i] = a[i];
            }

            for (int i = midl; i < a.length; i++) {
                right[i - midl] = a[i];
            }
            mergeSort(left);
            mergeSort(right);
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    a[k] = left[i];
                    i++;
                } else {
                    a[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < left.length) {
                a[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                a[k] = right[j];
                j++;
                k++;
            }
            return a;
        }
    }
}
