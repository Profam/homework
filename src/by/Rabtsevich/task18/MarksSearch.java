package by.Rabtsevich.task18;

import java.util.Scanner;

/* Задание 18.
Найти в строке не только запятые, но и другие знаки препинания.
Посчитать общее их количество.
 */

public class MarksSearch {

    public static void main(String[] args) {
        char[]punctuation_marks = {'?','!',',',';',':','-','"','/', '.', '(',')','[',']'};
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            for (char punctuation_mark : punctuation_marks) {
                if (str.charAt(i) == punctuation_mark) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Общее количество знаков препинания: "+ count);
    }
}
