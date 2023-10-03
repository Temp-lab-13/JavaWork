package WorkTwst;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * tasktwo
 */
public class tasktwo {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 4, 8, 3, 1 };
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            try (FileWriter writer = new FileWriter("notes3.txt", true)) {
                // запись всей строки
                String text = Arrays.toString(arr);
                writer.write(text);
                // запись по символам
                writer.append('\n');

                writer.flush();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }

        }
        // System.out.println(Arrays.toString(arr));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date();
        String d = dateFormat.format(date);
        System.out.println(d);
    }
}

/*
 * class BubbleSort {
 * private static File log;
 * private static FileWriter fileWriter;
 * 
 * public static void sort(int[] mas) {
 * try {
 * log = new File("log.txt");
 * log.createNewFile();
 * fileWriter = new FileWriter(log);
 * bubbleSort(mas);
 * 
 * } catch (IOException e) {
 * e.printStackTrace();
 * } finally {
 * try {
 * fileWriter.close();
 * } catch (IOException e) {
 * e.printStackTrace();
 * }
 * }
 * }
 * 
 * private static int[] bubbleSort(int[] mas) {
 * boolean isSorted = false;
 * int buffer;
 * 
 * while (!isSorted) {
 * isSorted = true;
 * for (int i = 0; i < mas.length - 1; i++) {
 * if (mas[i] > mas[i + 1]) {
 * isSorted = false;
 * 
 * buffer = mas[i];
 * mas[i] = mas[i + 1];
 * mas[i + 1] = buffer;
 * }
 * }
 * logStep(Arrays.toString(mas));
 * }
 * return mas;
 * }
 * 
 * public static void logStep(String note){
 * try {
 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
 * String timestamp = dateFormat.format(new Date());
 * fileWriter.write(timestamp + " " + note + "\n");
 * } catch (IOException e) {
 * e.printStackTrace();
 * }
 * }
 * 
 * }
 */