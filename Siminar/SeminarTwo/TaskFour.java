package Siminar.SeminarTwo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
public class TaskFour {
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "SeminarTwo/text.txt";
        String logPath = "SeminarTwo/log.txt";
        String text = "TEST";
        int num = 100;
        log(logPath);
        writeFile(TEST(text, num), filePath);
        closeLogger();
        System.out.println("Конец работы приложения");
    }

    static String TEST(String text, int number) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < number; i++)
            str.append(text);
        return str.toString();
        // Вариант 2.
        /*
         * Метод повторяет и записывает сплошняком указанную
         * в аргументах строку.
         * return text.repeat(number);
         */
    }

    static void writeFile(String text, String filePath) {
        // Обрабатываем возможные ошибки.
        try {
            // Создание переменной для работы с файлом по пути
            // указанном в аругментах. true - обозначает что файл надо дописывать а не
            // перезаписывать.
            FileWriter writer = new FileWriter(filePath, true);
            // Указывается что должно быть записано в файл.
            writer.write(text);
            // непосредственно запись ранее указанного в методах `write`
            writer.flush();
            // закрытие подключение к файлу.
            writer.close();
            // Если вруг что, программа не упадёт, а просто выведет указанное сообщение.
            logger.info("Запись выполнена успешно");
        } catch (Exception ex) {
            ex.printStackTrace(); // Выводит инфу по ошибке.
            System.out.println("Запись не удалась.");
            logger.warning("Запись в файл не удалась");
        }

        /*
         * Упращённый вариант.
         * try(FileWriter writer = new FileWriter(filePath);) {
         * writer.write(text);
         * writer.flush();
         * } catch (Exception ex) {
         * System.out.println("Запись не удалась.");
         * }
         */

    }

    static void log(String logPath) {
        try {
            FileHandler fileHandler = new FileHandler(logPath, true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler : handlers) {
            handler.close();
        }
    }

}
