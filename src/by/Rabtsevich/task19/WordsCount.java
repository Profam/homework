package by.Rabtsevich.task19;

/*
Задание 19.
Имеется строка с текстом. Подсчитать количество слов в тексте.
Желательно учесть, что слова могут разделяться несколькими
пробелами, в начале и конце текста также могут быть
пробелы, но могут и отсутствовать.
 */

import java.util.Scanner;

public class WordsCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ')
            str = str.trim();
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); ) {
                if (str.charAt(i) == ' ') {
                    while (str.charAt(i) == ' ') {
                        i++;
                    }
                    count ++;
                }
                i++;
            }
            count++;
        }
        System.out.println("Колличество слов: " + count);
    }
}
