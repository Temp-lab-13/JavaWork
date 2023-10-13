package Lesson.LessonThree;

import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        // Не изменяемый лист. Значения задаётся при создании.
        List<Integer> list = List.of(1, 2, 3, 4);
        // Создание итератора.
        Iterator<Integer> col = list.iterator();
        // Использование итератора.
        // Важно. Итератор позволяет обойти коллекцию.
        // Но не позволяет её менять.
        // В не зависимости от того, как создана коллекция.
        while (col.hasNext()) {
            System.out.println(col.next());
        }
    }

}
