package Lesson.LessonSix;

public class Main {
    public static void main(String[] args) {
        // Создаём экземпляр класса worked.
        // Присмваяивая его переменной work1.
        worked work1 = new worked();
        // Присваяиваем созданному экземпляру,
        // значения для его полей.
        work1.id = 01;
        work1.fietName = "Sergey";
        work1.lastName = "Temp";
        work1.salary = 50_000;
        System.out.println(work1.toString());

        worked work2 = new worked();
        work2.id = 02;
        work2.fietName = "Tim";
        work2.lastName = "Sar";
        work2.salary = 40_000;

        worked work3 = new worked();
        work3.id = 01;
        work3.fietName = "Sergey";
        work3.lastName = "Temp";
        work3.salary = 50_000;

        System.out.println(work1 == work3);
        System.out.println(work1.equals(work2));
        System.out.println(work1.equals(work3));
    }
}
