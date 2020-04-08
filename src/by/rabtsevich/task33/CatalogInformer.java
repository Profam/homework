package by.rabtsevich.task33;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
Задание 33.
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны  отдельно.
 */
public class CatalogInformer {

    private static void recurseSearch(String directoryName) {
        File directory = new File(directoryName);
        System.out.println(directory.getName() + (!directory.isDirectory() ? "  -" : ""));
        if (directory.isDirectory()) {
            File[] list = directory.listFiles();
            if (list != null)
                for (File name : list)
                    recurseSearch(name.getPath());
        }
    }

    public static void main(String[] args) {
        String dirName = "C://AMD";
        recurseSearch(dirName);
    }
}
