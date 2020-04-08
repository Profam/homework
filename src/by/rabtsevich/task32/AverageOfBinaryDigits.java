package by.rabtsevich.task32;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Задание 32.
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их
среднее арифметическое.
 */
public class AverageOfBinaryDigits {

        public  boolean printToFile (String fileName) throws IOException {
            DataOutputStream fos;
            try {
                fos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
                File file = new File(fileName);
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                return false;
            }
            for (int i = 0; i < 20; i++) {
                fos.writeChars(( (int) (Math.random() * 10 + 1)) + " ");
            }
            fos.close();
            return true;
        }

    public String readBinaryfile(String fileName) {
        DataInputStream fis;
            try {
                    fis = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
            byte[] bytes = new byte[fis.available()];
            int bytesCount = fis.read(bytes);
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
        public static void binaryAverage(String string) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File("randomnumbers.txt"));
            scanner.useDelimiter("[^0-9]+");
            while (scanner.hasNext()) {

            }
        }

        public static void main(String[] args) throws IOException {
            if (new AverageOfBinaryDigits().printToFile("randomnumbers.txt"))
                System.out.println("Запись в файл прошла успешно.");
            else System.out.println("Ошибка записи данных!");

            System.out.println("Содержимое randomnumbers.txt: ");
            String data = new AverageOfBinaryDigits().readBinaryfile("randomnumbers.txt");
            System.out.println(data);
            Scanner scanner = new Scanner(data);
            scanner.useDelimiter("[^0-9]+");
            int amt;
            int sum;
            amt = sum = 0;
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
                amt++;
            }
            System.out.println();
            System.out.print("среднеарифмитическое: ");
            System.out.print((double) sum / amt);
        }
}
