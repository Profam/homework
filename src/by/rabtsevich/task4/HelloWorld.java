package by.rabtsevich.task4;

import java.util.Scanner;

/*
Задание 4
Имеется прямоугольное отверстие размерами а и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */

public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размеры прямоугольного отверстия:");
        System.out.print("Сторона а: ");
        int a = s.nextInt();
        System.out.print("Сторона b: ");
        int b = s.nextInt();
        System.out.print("Введите радиус круглой картонки r: ");
        int r = s.nextInt();
        if (a <= 0 || b <= 0 || r <= 0)
            System.out.println("Ошибка! Введите положительные, ненулевые значения!");
        else {
            if (r * r >= (a * a + b * b) / 2)
                System.out.println("Картонка полностью закроет отверстие");
            else
                System.out.println("Нужна картонка побольше!");
        }
    }
}
