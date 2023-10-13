package Siminar.SeminarOne;

public class main {
    public static void main(String[] args) {
        /*
         * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
         * количество подряд идущих 1.
         */
        int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int i : array) {
            if (i == 1) {
                count++;
                if (maxCount <= count)
                    maxCount = count;
            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
