package by.rabtsevich.task27;



import java.util.*;

public class UnicListOfMarks {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
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
        removeSameMarks(marks);
        System.out.println("Список оценок " + marks.size() +" учеников: " + marks);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static void removeSameMarks(List<Integer> marks)  {
        HashSet<Integer> set = new LinkedHashSet<>(marks);
        marks.clear();
        marks.addAll(set);

    }
}
