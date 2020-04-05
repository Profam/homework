package by.rabtsevich.task5;

/*
Задание 5
Имеется целое число, это число - сумма денег в рублях.
Вывести это число,добавив к нему слово "рублей" в правильном падеже.
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите суммму денег в рублях: ");
        int money = s.nextInt();
        if (money % 100 == 11 || money % 100 == 12 || money % 100 == 13 || money % 100 == 14 ||
                money % 10 == 0 || money % 10 == 5 || money % 10 == 6 || money % 10 == 7 ||
                money % 10 == 8 || money % 10 == 9) {
            System.out.println("У Вас " + money + " рублей");
        } else if (money % 10 == 2 || money % 10 == 3 || money % 10 == 4) {
            System.out.println("У Вас " + money + " рубля");
        } else if (money % 10 == 1) {
            System.out.println("У Вас " + money + " рубль");
        } else {
            System.out.println("Ошибка! Сообщите нам об этом электронным письмом на адрес: goldar@tut.by");
        }

    }
}
