package by.Rabtsevich.task9;

/*
Задание 9.
Имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */


public class RandomMax {

    public static void main(String[] args) {
        int max = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            System.out.println("Случайное число: " + x);
            if (max < x)
                max = x;
            x = (int) (Math.random() * 20);
        }
        System.out.println("максимальное значение: " + max);
    }
}
