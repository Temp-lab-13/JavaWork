package Siminar.SeminarOne;

public class task3 {
    public static void main(String[] args) {
        /*
         * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
         * порядке.
         */
        String line = "Добро пожаловать на курс по Java";
        String[] words = line.split(" ");
        String line2 = "";
        for (int i = words.length - 1; i >= 0; i--) {
            line2 += words[i];
            if (i != 0) {
                line2 += " ";
            }
        }
        System.out.println(line2);
        // trim() позволяет убрать пустые строки(пробелы) после последнего символа
        // строки.
        // Таким образом, можно было бы обойтись без отдельной проверки в цикле на
        // последнее слово.
        // System.out.println(line2.trim());

    }

}
