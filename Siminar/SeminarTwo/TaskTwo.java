package Siminar.SeminarTwo;

/*
*Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2 
*/
public class TaskTwo {
    public static void main(String[] args) {
        String text = "aaaabbbcdd";
        StringBuilder text2 = new StringBuilder();

        int count = 1;
        for (int j = 0; j < text.length() - 1; j++) {
            if (text.charAt(j) == text.charAt(j + 1)) {
                count++;
            } else {
                text2.append(text.charAt(j));
                if (count > 1) {
                    text2.append(count);
                }

                count = 1;
            }
        }
        text2.append(text.charAt(text.length() - 1));
        if (count > 1) {
            text2.append(count);
        }
        System.out.println(text2.toString());

    }
}
