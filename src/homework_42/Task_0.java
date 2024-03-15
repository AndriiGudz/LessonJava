package homework_42;

import java.util.Arrays;
/*
Разбейте строку на слова, используя в качестве разделителя пробел.
Используя функцию reduce верните суммарное количество букв в словах, которые длиннее 4 символов
 */
public class Task_0 {
    public static void main(String[] args) {
        String text = "Hello, world and good afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);
    }

    public static int countLetters(String text) {
        return Arrays.stream(text.split(" "))  // Разбиваем строку на слова
                .filter(word -> word.length() > 4) // Оставляем только слова длиной более 4 символов
                .mapToInt(String::length)  // Преобразуем слова в их длины (количество букв)
                .reduce(0, Integer::sum);  // Суммируем длины слов
    }
}
