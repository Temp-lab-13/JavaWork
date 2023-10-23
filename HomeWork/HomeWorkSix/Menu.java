package HomeWork.HomeWorkSix;

import java.util.Scanner;
import java.util.Set;

public class Menu {
    public static void menu(Set<Laptop> prise) {
        String menuChois = "Доступны фильтры: \n" +
                "1 - Выбор брэнда; \n" +
                "2 - Выбор цвета; \n" +
                "3 - Выбор Операционной системы; \n" +
                "4 - Выбор объёма оперативной памяти; \n" +
                "5 - Выбор объёма памяти жёского диска. \n" +
                "6 - Получить список отфильтрованых товаров. \n" +
                "7 - Посмотреть весь прайс";

        boolean flag = true;
        // В инотвый массив складываем числовые параметры для проверки.
        // В строковый складываем строки.
        int[] choice = new int[2];
        String[] choice2 = new String[3];
        // Разобраться со сканером. Псоле ввода числа, не хочет потом работать со
        // строками.
        // Просто игнорирует их.
        // Решение: вводить строкой, и конвертировать в Int?
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println(menuChois);
            int v = 0;
            try {
                v = scanner.nextInt();
            } catch (Exception e) {
                // Почему-то, прога падает в зацикливание, вместо того,
                // что бы на следующей итерации снова запросить ввод.
                // Почмему-то не срабатывает сканер.
                // Блок пока оставил, что бы разобраться позже.
                // Разберусь - заверну остальные методы.
            }

            switch (v) {
                case 1:
                    System.out.println("Выберите Брэнд производителя: \n" +
                            "Asus \n" +
                            "HP \n" +
                            "Lenova \n" +
                            "Apple \n" +
                            "MSI \n" +
                            "GIGABATE \n");

                    choice2[0] = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Выберите Цвет ноутбука: \n" +
                            "Black \n" +
                            "White \n" +
                            "Red \n" +
                            "Metal \n" +
                            "Gray \n" +
                            "Green \n");
                    choice2[1] = sc.nextLine();
                    break;
                case 3:
                    System.out.println("Выберите Операционую Систему: \n" +
                            "Windiw 10 \n" +
                            "Windiw 11 \n" +
                            "MacOS \n" +
                            "Lunix \n" +
                            "notOS \n");
                    choice2[2] = sc.nextLine();
                    break;
                case 4:
                    System.out.println("Выберите Объём оперативной памяти: \n" +
                            "4 \n" +
                            "8 \n" +
                            "12 \n" +
                            "16 \n" +
                            "32 \n");
                    choice[0] = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Выберите Объём жёского диска: \n" +
                            "120 \n" +
                            "250 \n" +
                            "500 \n" +
                            "1000 \n" +
                            "2000 \n");
                    choice[1] = scanner.nextInt();
                    break;
                case 6:
                    flag = false;
                    break;
                case 7:
                    for (Laptop i : prise) {
                        System.out.println(i);
                    }
                    break;
                default:
                    System.out.println("\n Введена не корректная команда, попробуйте снова. \n");
            }
        }
        scanner.close();
        sc.close();
        filtrLaptops(choice, choice2, prise);

    }

    // Этот метод я бы вынести в отдельный класс, или перебросит в Laptop. Там он
    // уместней.
    public static void filtrLaptops(int[] arrayInt, String[] arraStrings, Set<Laptop> prise) {
        int check = 0;
        for (Laptop i : prise) {
            if (i.getBrand().equals(arraStrings[0]) || i.getColor().equals(arraStrings[1])
                    | i.getOS().equals(arraStrings[2]) || i.getMemory() == arrayInt[0] || i.getHDD() == arrayInt[1]) {
                System.out.println(i);
                check += 1;
            }
        }
        if (check == 0) {
            System.out.println("Ничего не найдено.");
        }
    }

}
