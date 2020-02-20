package by.Rabtsevich.task3;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
            if(x % 10 == 7)
                System.out.println("Последняя цифра числа " + x + " является семеркой.");
            else
                System.out.println("Последняя цифра числа " + x + " не является семеркой.");

    }
}
