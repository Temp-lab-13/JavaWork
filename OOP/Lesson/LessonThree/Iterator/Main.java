package OOP.Lesson.LessonThree.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
         * Используем интефейс Iterator, что бы пройтись по коллекции
         * и получить все её значения.
         */
        // Создаём коллекцию и заполняем её.
        List<Integer> listNum = new ArrayList<Integer>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(31);
        listNum.add(4);
        listNum.add(5);
        // Создамём экземпляр Итерартора, связанного с конкретной коллекцией,
        // для работы с ней.
        Iterator<Integer> iterator = listNum.iterator();
        // Используем обычный цикл, где в аргументах передаём итератор,
        // содержащий нашу коллекцию, и спомощью метода hasNext(),
        // который будет возращать true пока есть следующий элемент,
        // получаем все элементы по очереди.
        // Важно, так как итератор по сути копия коллекции, то мы не можем изменять
        // содержимое коллекции, только посмотреть и куда-то применить.
        while (iterator.hasNext()) {
            // Важно. Мы получаем следующий элемент а не текущий.
            // Так как итерация посути начинается не с 0, а с -1.
            System.out.println(iterator.next());
        }
    }

}
