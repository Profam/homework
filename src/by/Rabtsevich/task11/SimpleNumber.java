package by.Rabtsevich.task11;

/*
Задание 11.
Имеется целое число, определить является ли это число простым
т.е. делится без остатка только на 1 и себя.
 */

import java.util.Scanner;

public class SimpleNumber {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int x = in.nextInt();
        boolean isSimple =true;
        if(x<1)
            System.out.println("Ошибка! Введите натуральное число!");
            else if(x % 2 == 0 || x % 5 == 0)
                System.out.println("число " + x + " не является простым");
                else {
                    for (int i = 2; i < Math.sqrt(x); i++) {
                        if (x / i * i == x) {
                            isSimple = false;
                            break;
                        }
                    }
                    if (isSimple)
                        System.out.println("простое число");
                    else System.out.println("число " + x + " не является простым");
                }
    }
}
