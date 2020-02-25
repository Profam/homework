package by.Rabtsevich.task8;

/*
Задание 8.
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма,
а произведение, т. е. факториал числа.
 */

import java.util.Scanner;

public class Factorial {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 1;
        int i = 1;
        System.out.print("Введите факториал n: ");
        int n = in.nextInt();
        if(n<0)
            System.out.println("Факториал не определен для отрицательных чисел.");
        else {
            while (i <= n) {
                sum *= i;
                i++;
            }
            System.out.println(n + "! = " + sum);
            }
    }
}
