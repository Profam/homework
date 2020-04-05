package by.rabtsevich.task8;

/*
Задание 8.
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма,
а произведение, т. е. факториал числа.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Введите факториал n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Факториал не определен для отрицательных чисел.");
        } else {
            BigInteger sum = new BigInteger("1");
            int i = 2;
            while (i <= n) {
                sum = sum.multiply(BigInteger.valueOf(i));
                i++;
            }
            System.out.println(n + "! = " + sum);
        }
    }
}
