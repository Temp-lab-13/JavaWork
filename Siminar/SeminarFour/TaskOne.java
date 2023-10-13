package Siminar.SeminarFour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
 * Сравните с предыдущим.
 */
public class TaskOne {

    public static void main(String[] args) {
        // Создаём список-массив.
        List<Integer> list1 = new ArrayList<>();
        // Создаём двусвязный списко.
        List<Integer> list2 = new LinkedList<>();
        System.out.println("ArrayList: " + testSpeed(list1));
        System.out.println("LinkedList: " + testSpeed(list2));
    }

    // Метод-секундомер, проверям сколько времени нужно,
    // что бы добавить указанное значение элементов.
    private static long testSpeed(List<Integer> list) {
        // Ложим в переменную момент условного "старта".
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        // Ложим в переменную момент условного "конца".
        long timeFinish = System.currentTimeMillis();
        // Возращаем получившуюся разницу, считай -
        // время выполнения кода.
        return timeFinish - timeStart;
    }
}