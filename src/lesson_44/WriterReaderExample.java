package lesson_44;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriterReaderExample {
    public static void main(String[] args) {

        File path = new File("src/lesson_44/db");
        path.mkdirs();

        File fileName = new File(path, "test.txt"); // указываем в какую директорию, переменная path

        try {
            // создаем файл на диске
            fileName.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // создаем экземпляр "писателя", объекта умеющего записывать в файл символы
            FileWriter fileWriter = new FileWriter(fileName);
            // записываем в файл
            fileWriter.write("Hello, Java");
            // закрываем ресурс
            fileWriter.close();
            System.out.println("Запись в файл закончена.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Чтение из файла.
        // Буферизированные классы не работают с файлами на прямую.
        // Они являются обертками. При создании буфера, мы должны передать в конструктор объект класса,
        // который умеет читать/писать в файл.


        // try with resources ->

        try ( // ресурсы, открытые в скобках автоматически будут закрыты, когда работа кода с ними будет завершена

                // Создаем объект, умеющий читать из файла
                FileReader fileReader = new FileReader(fileName);
                // Создаем буфер и передаем ему в конструктор "читателя"
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            line = bufferedReader.readLine();
            System.out.println("Чтение строки завершено");
            System.out.println("line: " + line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // String[] list() - список имен файлов и названий директорий
        String[] names = path.list();
        System.out.println("names: " + Arrays.toString(names));

        // Files[] listFiles() - возвращает массив объектов типа File представляющих файлы и директории
        File[] files = path.listFiles();
        for (File file1 : files) {
            System.out.println("Это файл? " + file1.isFile());
            System.out.println(file1.getName() + " | " + file1.getPath());
        }


    }
}
