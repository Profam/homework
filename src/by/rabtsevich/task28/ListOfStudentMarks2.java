package by.rabtsevich.task28;

/*
Задание 26.
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
 */

import java.util.*;

public class ListOfStudentMarks2 {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        System.out.println("Добрый день! Выберите количество оценок учеников для просмотра:");
        Scanner input = new Scanner(System.in);
        int numberOfMarks;
        do {
            System.out.println("Ожидается ввод положительного числа: ");
            numberOfMarks = input.nextInt();
        } while (numberOfMarks <= 0);
        System.out.println("Список оценок учеников: ");
        for (int i = 0; i < numberOfMarks; i++) {
            marks.add(i,  (int) (Math.random()*10 + 1));
            System.out.print("[" + i + "]" + " = " + marks.get(i) + "; ");
        }
        maxMarks(marks);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static void maxMarks(List marks)  {
        ListIterator<Integer> listIterator = marks.listIterator();
        int maxMark = listIterator.next();
        while (listIterator.hasNext()) {
            Integer value = listIterator.next();
            if (maxMark < value) {
                maxMark = value;
            }
        }
        System.out.println();
        System.out.println("Самая высокая оценка: " + maxMark);
        while (listIterator.hasPrevious()) {
            Integer value = listIterator.previous();
            if (maxMark <= value) {
                maxMark = value;
                System.out.println("Номер элемента списка: " + (listIterator.previousIndex()+1));
            }
        }
    }
}
