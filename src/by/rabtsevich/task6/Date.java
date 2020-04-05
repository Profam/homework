package by.rabtsevich.task6;

/*
Задание 6
Имеются три числа - день, месяц, год. Вывести в виде трех чисел дату следующего дня.
 */

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = s.nextInt();
        System.out.print("Введите месяц: ");
        int month = s.nextInt();
        System.out.print("Введите год: ");
        int year = s.nextInt();
        nextDay(day, month, year);
    }

    private static void nextDay(int day, int month, int year) { // метод выводит на экран дату следующего дня в формате "d.m.y"
        if(day>31 || day<=0 || month>12 || month<=0 || year<=0)
            System.out.println("Ошибка! Введите корректную дату");

        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31 & month == 12)
                {
                    day = 1;
                    month = 1;
                    year +=1;
                } else if (day == 31)
                    {
                        day = 1;
                        month +=1;
                    } else
                        {
                            day +=1;
                        }
        }

        else if (month == 4 || month == 6 || month == 9 || month == 11) {     //(year % 4 == 0 & year % 100 == 0) {
            if (day == 30) {
                day = 1;
                month += 1;
                } else
                        day += 1;
        }

        else if (month == 2) {
            if (day > 29) {
                System.out.println("Ошибка! В феврале максимум 29 дней!");
                return;
            } else if ( (year % 4 == 0 & year % 100 != 0) || (year % 4 == 0 & year % 100 == 0 & year % 400 == 0)) {
                if (day < 29) {
                        day += 1;
                    } else if (day == 29){
                        day = 1;
                        month += 1;
                    } else System.out.println("Unexpected error!");
            } else {
                if (day < 28) {
                    day += 1;
                } else if (day == 28){
                    day = 1;
                    month += 1;
                } else {
                    System.out.println("Ошибка! В не високосном году 28 дней!");
                    return;
                }
            }
        }

        else {
            System.out.println("Unexpected error!");
            return;
        }

        System.out.println("Следующий день: " + day + "." + month + "." + year + " года");
    }
}