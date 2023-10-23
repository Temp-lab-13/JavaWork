package HomeWork.HomeWorkSix;

import java.util.Set;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println(Laptop.CreateLaptop());
        System.out.println("Важное Имя сайта.");
        Set<Laptop> prise = Laptop.CreateLaptop();
        Menu.menu(prise);

    }

}