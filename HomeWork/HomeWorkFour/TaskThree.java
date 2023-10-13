package HomeWork.HomeWorkFour;

import java.util.LinkedList;

public class TaskThree {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        a = 3;
        op = '+';
        b = 7;
        c = 4;
        op2 = '+';
        d = 7;
        undo = '<';
        System.out.println(calculate('+', a, c));
        System.out.println(calculate('*', a, c));
        System.out.println(calculate('-', b, a));
        System.out.println(calculate('<', b, a));
    }

    public static LinkedList<Integer> list = new LinkedList<Integer>();

    public static int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        int resalt = 0;

        switch (op) {
            case '+':
                resalt = a + b;
                list.add(resalt);
                break;

            case '-':
                resalt = a - b;
                list.add(resalt);
                break;

            case '*':
                resalt = a * b;
                list.add(resalt);
                break;

            case '/':
                resalt = a / b;
                list.add(resalt);
                break;

            case '<':
                resalt = list.getLast();
                break;

            default:
                System.out.println("Некорректный оператор: " + op);
                break;
        }
        return resalt;
    }

}
