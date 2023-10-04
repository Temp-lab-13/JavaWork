package SeminarTwo;

/*
 * Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
 */
public class TaskThree {
    public static void main(String[] args) {
        String text = "Потоп";
        System.out.println(strStr(text));
        System.out.println(strRevers(text));

    }

    // Первый вариант. Черз сравнение символос с начала и конца строки, с
    // последующим смещением проверки к центру строки.
    static boolean strStr(String text) {
        // Переводим весь текст в нижний регистр, для
        // однообразия текста. Ведь `П` не равно `п`.
        text = text.toLowerCase();
        // Идём циклом одновременно и с начала строки и сконца строки до середины.
        for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
            // И проверям, равныли символы.
            if (text.charAt(i) == text.charAt(j)) {
                // Если да, то переходим к следующей итерации и проверке следующих символов.
                continue;
                // Если есть хотя бы одно не совпадение,
                // то строка не палиндром и возращаем false.
            } else {
                return false;
            }
        }
        // Если всё ок, то true.
        return true;
    }

    // Второй вариант.
    // С переворотом строки и сравнением её с исходной.
    static boolean strRevers(String text) {
        // Так же приводим все символы строки к нижнему регистру.
        text = text.toLowerCase();
        // Создаём строку через StringBuilder, передавая в него исходную строку.
        StringBuilder str = new StringBuilder(text);
        // Переворачиваем новую строку.
        str.reverse();
        // Возращаем результат сравнения строки, предварительно вернув строку формата
        // StringBuilder в форматт простой String.
        return text.equals(str.toString());
    }
}
