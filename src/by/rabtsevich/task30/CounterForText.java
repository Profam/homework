package by.rabtsevich.task30;

/*
Задание 30.
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CounterForText {

    private static final String WORDS= "[\\p{Punct}\\s]+";
    private static final String PUNCTUATION= "[^\\p{Punct}\\s]+";

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

    static void printState(String filter) {
            if (filter.equals(WORDS))
            System.out.println("Идет подсчет слов...");
            else if (filter.equals(PUNCTUATION)) System.out.println("Идет подсчет знаков препинания...");
    }

    public static void count(String data, String filter) throws FileNotFoundException {
            File file = new File("readme.txt");
            Scanner input = new Scanner(new FileReader(file));
            input.useDelimiter(filter);
            //Используем динамический массив для наглядности и теста подсчета.
            ArrayList<String> strings = new ArrayList<>();
            printState(filter);
            while (input.hasNext())
                strings.add(input.next());
            System.out.println("Количесвтво искомых данных: " + strings.size());
            for(int i = 0; i<strings.size(); i++)
            {
                System.out.print("[" + i + "] =" + strings.get(i) + ";");
            }
        System.out.println();
        }

    public static void main(String[] args) throws FileNotFoundException {
            CounterForText readFromFIle = new CounterForText();
            String data = readFromFIle.readFromFile("readme.txt");
            System.out.println("Data:");
            System.out.println(data);
            count(data, PUNCTUATION);
            count(data, WORDS);
        }
}
