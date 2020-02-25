package by.Rabtsevich.task10;

/*
Имеется целое число. Следует посчитать сумму цифр данного числа.
 */

import java.util.Scanner;

public class SumDigits {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int x = in.nextInt();
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        System.out.println("Сумма цифр числа равна " + sum);
    }
}
