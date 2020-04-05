package by.rabtsevich.task11;

/*
Задание 11.
Имеется целое число, определить является ли это число простым
т.е. делится без остатка только на 1 и себя.
*/

import java.util.Scanner;

public class SimpleNumber {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        if(value<1) {
            System.out.println("Ошибка! Введите натуральное число!");
            return;
        }
        if(isSimple(value))
                        System.out.println("простое число");
        else
            System.out.println("число " + value + " не является простым");
    }

    private static boolean isSimple(int value) {
        if (value == 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++ ) {
            if (value % i == 0)
                return false;
        }
        return true;
    }
}
