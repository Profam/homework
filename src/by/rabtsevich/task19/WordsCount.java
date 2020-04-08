package by.rabtsevich.task19;

/*
Задание 19.
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться
несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class WordsCount {

    private static Scanner in = new Scanner(System.in);
    private static String str;

    public static void main(String[] args) {
        do {
            System.out.print("Ожидается ввод текста. Введите строку: ");
            str = in.nextLine();
        } while (str.isEmpty());
            in = new Scanner(str);
            in.useDelimiter("[\\p{Punct}\\s]+");

        ArrayList<String> strings = new ArrayList<>();
        while (in.hasNext())
        strings.add(in.next());
        System.out.println("Количество слов: " + strings.size());
        for(int i = 0; i<strings.size(); i++)
        {
            System.out.print("[" + i + "] =" + strings.get(i) + ";");
        }
        System.out.println();
    }
}
