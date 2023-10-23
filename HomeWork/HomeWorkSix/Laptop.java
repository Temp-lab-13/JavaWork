package HomeWork.HomeWorkSix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Класс отвечает за формирование товара типа "Ноутбук".
 * Хранение полного списка сформированного товара.
 * Хранение параметров товара.
 */
public class Laptop {
    /*
     * Поля класса
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     */
    private int memory;
    private int hdd;
    private String os;
    private String color;
    private String brand;

    public int getMemory() {
        return memory;
    }

    public int getHDD() {
        return hdd;
    }

    public String getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public static HashMap<Integer, Integer> Memory() {
        HashMap<Integer, Integer> rosterMemory = new HashMap<>();
        rosterMemory.put(1, 4);
        rosterMemory.put(2, 8);
        rosterMemory.put(3, 12);
        rosterMemory.put(4, 16);
        rosterMemory.put(5, 32);
        return rosterMemory;
    }

    public static HashMap<Integer, Integer> HDD() {
        HashMap<Integer, Integer> rosterHDD = new HashMap<>();
        rosterHDD.put(1, 120);
        rosterHDD.put(2, 250);
        rosterHDD.put(3, 500);
        rosterHDD.put(4, 1000);
        rosterHDD.put(5, 2000);
        return rosterHDD;
    }

    public static HashMap<Integer, String> OS() {
        HashMap<Integer, String> rosterOS = new HashMap<>();
        rosterOS.put(1, "Windiw 10");
        rosterOS.put(2, "Windiw 11");
        rosterOS.put(3, "MacOS");
        rosterOS.put(4, "Lunix");
        rosterOS.put(5, "notOS");
        return rosterOS;
    }

    public static HashMap<Integer, String> Color() {
        HashMap<Integer, String> rosterColor = new HashMap<>();
        rosterColor.put(1, "Black");
        rosterColor.put(2, "White ");
        rosterColor.put(3, "Red");
        rosterColor.put(4, "Metal");
        rosterColor.put(5, "Gray");
        rosterColor.put(6, "Green");
        return rosterColor;
    }

    public static HashMap<Integer, String> Brend() {
        HashMap<Integer, String> rosterBrend = new HashMap<>();
        rosterBrend.put(1, "Asus");
        rosterBrend.put(2, "HP");
        rosterBrend.put(3, "Lenova");
        rosterBrend.put(4, "Apple");
        rosterBrend.put(5, "MSI");
        rosterBrend.put(6, "GIGABATE");
        return rosterBrend;
    }

    public static Laptop recorLaptop(
            HashMap<Integer, String> Brend,
            HashMap<Integer, String> Os,
            HashMap<Integer, String> Color,
            HashMap<Integer, Integer> Memory,
            HashMap<Integer, Integer> Hdd) {
        Laptop laptop = new Laptop();
        Random random = new Random();
        laptop.brand = Brend.get(random.nextInt(1, Brend.size() + 1));
        laptop.os = Os.get(random.nextInt(1, Os.size() + 1));
        laptop.color = Color.get(random.nextInt(1, Color.size() + 1));
        laptop.memory = Memory.get(random.nextInt(1, Memory.size() + 1));
        laptop.hdd = Hdd.get(random.nextInt(1, Hdd.size() + 1));
        return laptop;
    }

    public static Set<Laptop> CreateLaptop() {
        HashMap brend = Brend();
        HashMap os = OS();
        HashMap color = Color();
        HashMap memory = Memory();
        HashMap hdd = HDD();
        Set<Laptop> rosterLaptops = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            rosterLaptops.add(recorLaptop(brend, os, color, memory, hdd));
        }
        return rosterLaptops;
    }

    @Override

    public String toString() {
        return String.format("Брэнд: %s, Цвет: %s, OS: %s, Оперативная память: %d, HDD: %d \n",
                brand, color, os,
                memory, hdd);
    }

}