package by.rabtsevich.task29;

/*
Задание 29.
Имеется текст. Следует составить из него частотный словарь.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyDictionary {

    public static void main(String[] args) {
        System.out.println("Добрый день! Введите текст:");
        Scanner str = new Scanner(System.in);
        String stringOfText;
        do {
            System.out.print("Ожидается ввод текста: ");
            stringOfText = str.nextLine();
        } while (stringOfText.isEmpty());
        Map<String, Integer> textMap=new HashMap<>();
        for (String word: stringOfText.split("[\\p{Punct}\\s]+")) {
            if (textMap.containsKey(word)) {
                textMap.put(word, textMap.get(word)+ 1);
            } else textMap.put(word, 1);
        }
        System.out.println(textMap);
    }
}
