package Lesson.LessonThree;

public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
    }

    /*
     * Метод возращает расширенный массив,
     * с добавленным в нём новым элементом,
     * в конец массива.
     */
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
