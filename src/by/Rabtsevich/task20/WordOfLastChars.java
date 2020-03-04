package by.Rabtsevich.task20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
задание 20.
Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */

public class WordOfLastChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String regexp = "([а-яА-Я]+)|([a-zA-Z]+)";
        if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ')
            str = str.trim();
        if (str.length() != 0) {
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(str);
            StringBuilder newStr = new StringBuilder();
            while (matcher.find()) {
                newStr.append(str.substring(matcher.end()-1, matcher.end()));
            }
            System.out.println(newStr);
        }else System.out.println("Ошибка! Введите текст!");
    }
}
