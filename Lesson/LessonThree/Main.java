package Lesson.LessonThree;

public class Main {
    public static void main(String[] args) {
        Object o = 1;
        System.out.println(o.getClass().getName());
        // Вывод: java.lang.Integer
        o = 1.2;
        System.out.println(o.getClass().getName());
        // Вывод: java.lang.Double

        System.out.println(Sum(1, 2)); // 3
        System.out.println(Sum(1.0, 2)); // 0
        System.out.println(Sum(1, 2.0)); // 0
        System.out.println(Sum(1.2, 2.1)); // 3.3
    }

    /*
     * Метод принимает два объекта - любьой педанный в него тип данных.
     * После чего проверяет к каким типам данных относится
     * переданые данные.
     * Если оба объекта одинакового типа, то объекты
     * конверитруются в изначальный тип данных,
     * проводиться обработка (сложение),
     * и возвращение результата, предварительно
     * преобразованного обратно в Object.
     * Прелесть Object в том, что он может вобрать в себя,
     * вообще любой тип данных, которые потом можно
     * преобразовать в изначальный тип и обработать
     * в одном методе.
     */
    static Object Sum(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Float && b instanceof Float) {
            return (Object) ((Float) a + (Float) b);
        } else if (a instanceof String && b instanceof String) {
            return (Object) ((String) a + (String) b);
        } else {
            return 0;
        }
    }

}
