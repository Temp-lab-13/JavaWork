package Siminar.SeminarTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class TaskThree {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("wow");
        list.add(1.12);
        list.add("0");
        // deletInteger(list);
        deletIntegerL(list);
    }

    static void deletInteger(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }

    }

    static void removeIntegersV2(ArrayList list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof Integer) {
                iterator.remove();
            }
        }
    }

    static void deletIntegerL(ArrayList list) {
        list.removeIf(obj -> obj instanceof Integer);
    }
}
