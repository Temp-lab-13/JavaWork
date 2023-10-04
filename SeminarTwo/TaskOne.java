package SeminarTwo;

/**
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из
 * чередующихся символов c1 и c2, начиная с c1.
 * Ответ: c1c2c1…c2 (всего N символов)
 */
public class TaskOne {

    public static void main(String[] args) {
        int N = 10;
        char c1 = 'c';
        char c2 = 's';
        StringBuilder text = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < N / 2; i++) {
            /*
             * для не чётного случая. N будет без деления.
             * if (flag) {
             * text.append(c1);
             * flag = false;
             * } else {
             * text.append(c2);
             * flag = true;
             * }
             */
            text.append(c1);
            text.append(c2);
        }
        System.out.println(text);
    }
}