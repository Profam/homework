package by.rabtsevich.task26;

/*
Задание 26.
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
 */

import java.util.*;

public class ListOfStudentMarks {

    public static void main(String[] args) {

        List marks = new ArrayList();
        System.out.println("Добрый день! Выберите количество оценок учеников для просмотра:");
        Scanner input = new Scanner(System.in);
        int numberOfMarks;
        do {
            numberOfMarks = input.nextInt();
        } while (numberOfMarks <= 0);
        for (int i = 0; i < numberOfMarks; i++) {
            marks.add(i, (int) (Math.random()*10 + 1));
        }
        System.out.println("Список оценок " + marks.size() +" учеников: " + marks);
        removeBadMarks(marks);
        System.out.println("Список оценок " + marks.size() +" учеников: " + marks);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static void removeBadMarks(List marks)  {
        for (int i = marks.size()-1; i >= 0; i--) {
            if ((int) marks.get(i) < 4)
                marks.remove(i);
        }
    }
}
