package by.Rabtsevich.task4;

import java.util.Scanner;

/*
Задание 4
Имеется прямоугольное отверстие размерами а и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */

public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите размеры прямоугольного отверстия: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("Введите радиус круглой картонки: ");
        int r = s.nextInt(); //длина хорды (l = 2*R*sin(a/2))
        if(r >= Math.sqrt(a*a+b*b)/2)
            System.out.println("Картонка полностью закроет отверстие");
        else
            System.out.println("Нужна картонка побольше!");
    }
}
