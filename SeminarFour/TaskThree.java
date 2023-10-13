package SeminarFour;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.

Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

Если введено revert, удаляет предыдущую введенную строку из памяти.

 */
public class TaskThree {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean work = true;
            while (work) {
                String line = scanner.nextLine();
                switch (line) {
                    case "print":
                        for (String s : list) {
                            System.out.println(s);
                        }
                        break;
                    case "revert":
                        list.remove(0);
                        break;
                    case "finish":
                        work = false;
                        break;
                    default:
                        list.add(0, line);
                }
            }
        }
    }

}
