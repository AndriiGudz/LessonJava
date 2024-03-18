package lesson_44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Создайте 10 файлов: test_1.txt, ... test_10.txt
        2. В каждый файл записать строку соответственно: Java1, Java2, ... Java10
         */


        File path = new File("src/lesson_44/task1");
        path.mkdirs();
        // Создаем 10 файлов и записываем строки
        for (int i = 1; i <= 10; i++) {
            String fileName = "test_" + i + ".txt";
            String content = "Java" + i;

            try {
                // Создаем новый файл
                File file = new File(path, fileName);

                // Проверяем, существует ли файл, если нет, то создаем его
                if (!file.exists()) {
                    file.createNewFile();
                }

                // Записываем строку в файл
                FileWriter writer = new FileWriter(file);
                writer.write(content);
                writer.close(); // если что-то пойдет не так, до закрытия не дойдем

                System.out.println("Файл " + fileName + " успешно создан и заполнен.");
            } catch (IOException e) {
                System.out.println("Ошибка при создании или записи в файл " + fileName);
                e.printStackTrace();
            }
        }

        /*
        Проверить все файлы в директории
        Получить список всех файлов, залезть в каждый, прочитать строку, сравнить, вывести имя файла, если есть такая строка
        Выведите в консоль имя файла, в котором содержится строка "Java7"
        // output: test_7.txt
         */

        // Директория, в которой находятся файлы
        String directoryPath = "src/lesson_44/task1";

        // Получаем список файлов в директории
        List<File> files = getFilesInDirectory(directoryPath);

        // Проверяем каждый файл на наличие строки "Java7"
        for (File file : files) {
            try {
                String content = Files.readString(Paths.get(file.getPath()));
                if (content.contains("Java7")) {
                    System.out.println("Файл с содержанием 'Java7' найден: " + file.getName());
                }
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + file.getName());
                e.printStackTrace();
            }
        }

        // Второй вариант решения задачи
//        File[] files1 = path.listFiles();
//
//        for (File file : files1) {
//            try (BufferedReader bufferedReader = new BufferedReader()){
//
//            }
//        }

    }

    private static List<File> getFilesInDirectory(String directoryPath) {
        List<File> files = new ArrayList<>();
        File directory = new File(directoryPath);

        // Проверяем, является ли путь директорией и существует ли
        if (directory.isDirectory() && directory.exists()) {
            File[] fileList = directory.listFiles();

            // Добавляем каждый файл в список
            if (fileList != null) {
                for (File file : fileList) {
                    if (file.isFile()) {
                        files.add(file);
                    }
                }
            }
        } else {
            System.err.println("Указанный путь не является директорией или не существует.");
        }

        return files;
    }
}
