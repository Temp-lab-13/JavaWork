package HomeWork.HomeWorkTree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/*
Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:

    Сортирует его по возрастанию и выводит на экран
    Находит минимальное значение в списке и выводит на экран - Minimum is {число}
    Находит максимальное значение в списке и выводит на экран - Maximum is {число}
    Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}

Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел

Пример:
arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5

 */
public class taskThree {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        int average = 0;
        for (Integer integer : arr) {
            average += integer;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + arr[0]);
        System.out.println("Maximum is " + arr[arr.length - 1]);
        System.out.println("Average is = " + average / arr.length);

    }

}
