package by.rabtsevich.task13;

/*
Задание 13.
Решить задание на поиск простых чисел с использованием break.
 */

import java.util.Scanner;

public class SimpleNumber2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
