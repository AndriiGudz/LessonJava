package homework_38.task_1;
/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

import java.util.*;
import java.util.stream.Collectors;

public class Task_1 {
    public static List<String> getUniqueSortedWords(String input) {
        // 1. Избавиться от знака препинания (, !, ", :, ;)
        // 2. Разделить строку на слова.
        // 3. Поместить слова в какую-то коллекцию, которая обеспечит уникальность (уберет повторы) и сортировку.
        // 4. Вернуть список (если нужно, преобразовать коллекцию в список и вернуть).
        String withoutPunchSymbols = input.replaceAll("[^a-zA-Z0-9а-яА-Я ]", ""); // Избавиться от знака препинания (, !, ", :, ;)
        System.out.println(withoutPunchSymbols);
        String[] words = withoutPunchSymbols.split("\\s+"); // разделяем строку на слова

        // Преобразовать массив слов в список и удалить повторения
        // Создаем компаратор для сортировки слов.
        Set<String> uniqWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqWords.addAll(Arrays.asList(words));

        // Преобразуем множество в список и возвращаем.
        return new ArrayList<>(uniqWords);
    }

    public static void main(String[] args) {
        String string = "Тестовая строка для удаления слов, которые повторяются. Строка для удаления!";
        System.out.println(getUniqueSortedWords(string));
    }
}
