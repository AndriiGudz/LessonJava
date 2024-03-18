package lesson_44.catsWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatsWriterReader {
    public static void main(String[] args) {
        List<Catty> cats = new ArrayList<>(List.of(
                new Catty("Cat", 9, true),
                new Catty("John", 2, true),
                new Catty("Boris", 7, true),
                new Catty("Hanna", 4, false),
                new Catty("Maria", 6, false),
                new Catty("Max", 3, true)
        ));

        File path = new File("src/lesson_44/catsWriter");
        path.mkdirs();

        File file = new File(path, "cats.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Записать список кошек в файл
        writeCatsFile(cats, file);

        // Считать из файла список кошек и собрать в список
        List<Catty> cattyList = readCatsFromFile(file);

        cattyList.forEach(System.out::println);

    }

    private static List<Catty> readCatsFromFile(File file) {
        List<Catty> cats = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;

            // Цикл считывания строк из файла (пока строки в файле есть)
            while ((line = reader.readLine()) != null) {
                // System.out.println(line);
                Catty cat = parseCatFromString(line);
                cats.add(cat);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cats;
    }

    private static Catty parseCatFromString(String line) {
        String[] strings = line.split("\\|");
        // System.out.println(Arrays.toString(strings));

        return new Catty(strings[0], Integer.parseInt(strings[1]), Boolean.parseBoolean(strings[2]));
    }

    private static void writeCatsFile(List<Catty> cats, File file) {

        // Удаляем файл, если он есть, для очистки старого содержимого :)))
        file.delete();

        for (Catty cat : cats) {
            try(
                    // Разрешение дозаписи в файл. Если в файле уже были какие-то символы - не очищать файл.
                    FileWriter fileWriter = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            ) {
                file.createNewFile();

                // Cat | 9 | trueJohn | 2 | true
                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine(); // перенос на новую строку / перевод каретки / перенос курсора на новую строку
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
