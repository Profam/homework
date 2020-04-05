package by.rabtsevich.task23;

/*
Задание 23.
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги.
На вход передается сумма денег. На выход - булевское значение (операция удалась или нет). При снятии денег функция
должна распечатывать каким количесвом купюр какого номинала выдается сумма. Создать конструктор с тремя параметрами
- количеством купюр. Прочее - на ваше усмотрение.
 */

import java.util.Scanner;

public class Bankomat {

    private int numberOfBanknotesOf20;
    private int numberOfBanknotesOf50;
    private int numberOfBanknotesOf100;

    public void addNumberOfBanknotesOf20(int numberOfBanknotesOf20) {
        if (numberOfBanknotesOf20 <= 0)
            System.out.println("Ошибка! Введите положительное ненулевое значение!");
        else this.numberOfBanknotesOf20 += numberOfBanknotesOf20;
    }

    public void addNumberOfBanknotesOf50(int numberOfBanknotesOf50) {
        if (numberOfBanknotesOf50 <= 0)
            System.out.println("Ошибка! Введите положительное ненулевое значение!");
        else this.numberOfBanknotesOf50 += numberOfBanknotesOf50;
    }

    public void addNumberOfBanknotesOf100(int numberOfBanknotesOf100) {
        if (numberOfBanknotesOf100 <= 0)
            System.out.println("Ошибка! Введите положительное ненулевое значение!");
        else this.numberOfBanknotesOf100 += numberOfBanknotesOf100;
    }

    private boolean getMoney() {
        System.out.println("Добрый день! Введите сумму для снятия: ");
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        if (money <= 0) {
            System.out.println("Операция не удалась! Введите положительную ненулевую сумму!");
            return false;

        } else if (money % 10 != 0 || money == 10 || money == 30) {
            System.out.println("Операция не удалась! Доступны купюры номиналом: ");
            if (numberOfBanknotesOf20 != 0) System.out.print("20 ");
            if (numberOfBanknotesOf50 != 0) System.out.print("50 ");
            if (numberOfBanknotesOf100 != 0) System.out.print("100 ");
            return false;

        } else if (numberOfBanknotesOf20*20+numberOfBanknotesOf50*50+numberOfBanknotesOf100*100 >= money) {

            int[] banknotes = {20, 50, 100};
            int i = 0, j, k = banknotes.length;
            while (k != 0 && banknotes[--k] > money);
            j = k;
            int tempSum, count;
            do {
                if ((tempSum = money % banknotes[j]) >= banknotes[0] || tempSum == 0) {
                    count = money / banknotes[j];
                    money = tempSum;
                } else {
                        count = money / banknotes[j] - 1;
                        money = tempSum + banknotes[j];
                }
                if (!(tempSum % banknotes[0] == 0) && j == 0) {
                    count ++;
                    money = tempSum + banknotes[j+1];
                }
                System.out.println("Denomination: " + banknotes[j] + "; count: " + count);
                while (j != 0 && banknotes[--j] > money);
            } while (i < k && money > 0);
        return true;
        }
        return false;
    }

    private Bankomat(int numberOfBanknotesOf20, int numberOfBanknotesOf50, int numberOfBanknotesOf100) {
        if (numberOfBanknotesOf20 < 0 || numberOfBanknotesOf50 < 0 || numberOfBanknotesOf100 < 0) {
            System.out.println("Ошибка при загрузке банкомата!");
            System.out.close();
        } else {
            this.numberOfBanknotesOf20 = numberOfBanknotesOf20;
            this.numberOfBanknotesOf50 = numberOfBanknotesOf50;
            this.numberOfBanknotesOf100 = numberOfBanknotesOf100;
        }
    }

    public static void main(String[] args) {
        Bankomat bankomat1 = new Bankomat(10,20,20);
        while (!bankomat1.getMoney())
        bankomat1.getMoney();
    }
}
