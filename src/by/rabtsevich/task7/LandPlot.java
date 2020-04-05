package by.rabtsevich.task7;

import java.util.Scanner;

/*
Задание 7
Имеются два дома размерами a на b и c на d.
Имеется учаток размерами e на f.
Проверить помещаются ли эти дома на данном участке. Стороны домов - параллельны сторонам участка,
в остальном размещение может быть любым.
 */
public class LandPlot {
    public static void main(String[] args) {
        double a, b, c, d, e, f;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размеры первого дома: ");
        a=s.nextDouble();
        b=s.nextDouble();
        System.out.println("Введите размеры второго дома: ");
        c=s.nextDouble();
        d=s.nextDouble();
        System.out.println("Введите размеры участка: ");
        e=s.nextDouble();
        f=s.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0 || e <= 0 || f <= 0)
            System.out.println("Ошибка! Введите положительные, ненулевые значения!");
        else {
            System.out.print(
                        (e >= a && e >= c && f >= (b + d)) ||
                        (e >= b && e >= c && f >= (a + d)) ||
                        (e >= a && e >= d && f >= (b + c)) ||
                        (e >= b && e >= d && f >= (a + c)) ||
                        (f >= a && f >= c && e >= (b + d)) ||
                        (f >= b && f >= c && e >= (a + d)) ||
                        (f >= a && f >= d && e >= (b + c)) ||
                        (f >= b && f >= d && e >= (a + c)) ? "Дома помещаются на участке." : "Дома не помещаются на участке.");
        }
    }
}
