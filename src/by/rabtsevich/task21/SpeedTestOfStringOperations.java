package by.rabtsevich.task21;

/*
Задание 21.
Напишите два цикла, выполняющих многократное сложение строк,
один с помощью оператора сложения и String,
а другой с помощью StringBuilder и метода append.
Сравните скорость их выполнения.
 */

import java.util.Scanner;

public class SpeedTestOfStringOperations {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Скоростной тест String и StringBuilder");
        int iteration = -1;
        while (iteration <= 0) {
            System.out.print("Введите количество операций по сложению строк:");
                iteration = in.nextInt();
        }

        compareStringsConcat(testSpeedOfString(iteration), testSpeedOfStringBuilder(iteration));

    }

    static long testSpeedOfString(int iterations) {
        String  str = "0";
        for(int i = 1; i < iterations; i++) {
            str+=i;
        }
        long x = System.nanoTime();
        System.out.println("String length: " + str.length());
        System.out.println("Total time: " + x/1E6 + " ms");
        return x;
    }

    static long testSpeedOfStringBuilder(int iterations) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < iterations; i++) {
            str.append(i);
        }
        long x = System.nanoTime();
        System.out.println("StringBuilder length: " + str.length());
        System.out.println("Total time: " + x/1E6 + " ms");
        return x;
    }

    static void compareStringsConcat(long speed1, long speed2) {
        System.out.println("StringBuilder быстрее String на: " + (speed2-speed1)/1E6 + " ms");
    }
}
