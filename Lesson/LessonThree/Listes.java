package Lesson.LessonThree;

import java.util.ArrayList;
import java.util.List;

public class Listes {
    public static void main(String[] args) {
        // ArrayList, меха нически,по сути массив.
        List<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        // Листу можно задать размер.
        List<Integer> list3 = new ArrayList<Integer>(10);
        // Или указать другой лист, как прототип.
        ArrayList<Integer> list4 = new ArrayList<Integer>(list3);
        // Так же, любой List можно создать без указания,
        // конкретного типа данных.
        List list5 = new ArrayList<>();
        ArrayList list6 = new ArrayList<>();
        // И тога, в них можно будет полоижть любой тип.
        // Можно даже в пермешку,
        // в листе будут храниться по сути объекты.
        // Но работать с этим потом, будет крайне хреново.

        list3.add(5); // Добавление элемента.
        list3.add(5);
        list3.add(5);

        // Так можно перебрать любой лист любого типа.
        // Но лучше вместо Object указывать конкретный тип
        // данных, хранящихся в листе. Это быстрее.
        // Так как не происходит запаковка в Object.
        for (Object object : list) {
            System.out.println(object);
        }

        // в "сырой" лист можно положить как строку, так и число.
        list5.add("Хеллоу");
        list5.add(10);

        for (Object object : list5) {
            System.out.println(object);
        }
    }

}
