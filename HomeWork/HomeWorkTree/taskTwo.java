package HomeWork.HomeWorkTree;

import java.util.ArrayList;

public class taskTwo {
    /*
     * Напишите функцию removeEvenNumbers, которая принимала бы произвольный список
     * целых чисел, удаляла бы из него четные числа и выводила список без четных
     * чисел.
     * Напишите свой код в методе removeEvenNumbers класса Answer. Метод
     * removeEvenNumbers принимает на вход один параметр:
     * Integer[] arr - список целых чисел
     * 
     * Пример:
     * arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
     * removeEvenNumbers(arr);
     * 
     * // [1, 3, 5, 7, 9]
     * 
     * arr = new Integer[]{2, 4, 6, 8};
     * removeEvenNumbers(arr);
     * 
     * // []
     */
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        removeEvenNumbers(arr);

    }

    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                list.add(arr[i]);
            }
        }
        System.out.println(list.toString());
    }
}
