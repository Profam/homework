package by.rabtsevich.task31;

import by.rabtsevich.task30.CounterForText;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
Задание 31.
Имеется файл с текстом в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
убрать все повторяющиеся числа и снова распечатать.
 */
public class NumberCounter {
    public  String readFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)){
            System.out.println("Available: " + fis.available());
            byte[] bytes = new byte[fis.available()];
            int bytesCount = fis.read(bytes);
            System.out.println("Read: " + bytesCount);
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList findNumbers(String data) throws FileNotFoundException {
        File file = new File("readme.txt");
        Scanner input = new Scanner(new FileReader(file));
        input.useDelimiter("[^0-9]+");
        //Используем динамический массив для наглядности и теста подсчета.
        ArrayList<Integer> digits = new ArrayList<>();
        while (input.hasNext())
            digits.add(input.nextInt());
        System.out.println("Колличесвтво искомых данных: " + digits.size());
        for(int i = 0; i<digits.size(); i++)
        {
            System.out.print("[" + i + "] =" + digits.get(i) + ";");
        }
        System.out.println();
        return digits;
    }
    public static void sumOfNumbers(ArrayList digits) {
        int sum = digits.stream()
                .mapToInt(value -> (int) value)
                .sum();
        System.out.println("Сумма чисел файла: " + sum);
    }
    public static ArrayList removeSameDigits(ArrayList digits) {
        HashSet<Integer> set = new LinkedHashSet<>(digits);
        digits.clear();
        digits.addAll(set);
        System.out.println("Количество уникальных чисел: " + digits.size());
        return digits;
    }

    public static void main(String[] args) throws FileNotFoundException {
        CounterForText readFromFIle = new CounterForText();
        String data = readFromFIle.readFromFile("readme.txt");
        System.out.println("Data:");
        System.out.println(data);
        sumOfNumbers(findNumbers(data));
        System.out.println();
        System.out.println(removeSameDigits(findNumbers(data)));
    }
}
