package lesson_44;

import java.io.File;
import java.io.IOException;

public class IoExample {
    public static void main(String[] args) {
        File pathDir = new File("./testDir");

        // Операции с файлами и директориями

        // mkdir() - создать директорию (папку) (boolean). Создает только конечную папку (без какой-либо вложенности).
        System.out.println(pathDir.mkdir());

        // File multiPath = new File("/dir1/db/myDir");
        // File multiPath = new File("dir1/db/myDir");
        // System.out.println(multiPath.mkdir()); // Папок пути не существует. mkdir() не смог создать папку myDir.

        // mkdirs() - создает директорию, включая все необходимые родительские директории.
        // System.out.println("mkdirs(): " + multiPath.mkdirs());

        // File multiPath1 = new File("dir1/db/myDir");
        // System.out.println("delete(): " + multiPath1.delete());

        // delete() - удаляет файл или директорию
        // System.out.println(multiPath.delete());

        // void deleteOnExit() - файл (или директория) будет удален по завершению работы виртуальной машины.

        File path = new File("src/lesson_44/db");
        path.mkdirs(); // создаем директории

        File file = new File(path, "text.txt");

        // createNewFile() - создает новый файл, если файл с таким именем еще не существует.
        // создаем файл по указанному пути
        try {
            // файл будет создан, если существует все директории в указанном path (не умеет создавать "нужные" директории)
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // проверка свойств файла / директории
        // isFile - возвращает true, если объект является файлом
        // isDirectory - возвращает true, если объект является директорией
        System.out.println("path.isFile(): " + path.isFile());
        System.out.println("path.isDirectory(): " + path.isDirectory());
        System.out.println("file.isFile(): " + file.isFile());

        // isHidden() - является ли файл / директория скрытой
        System.out.println("path.isHidden(): " + path.isHidden());

        // length
        // lastModified
        // getPath
        // getName

        System.out.println(path.length());
        System.out.println(path.lastModified());
        System.out.println(file.getPath());
        System.out.println(file.getName());


    }
}
