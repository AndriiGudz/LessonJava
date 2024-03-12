package homework_39.task_2;

import java.util.HashMap;
import java.util.Map;

/*
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }

    Task 2
Напишите метод, возвращающий частотный словарь вхождения символов в строку

 */
public class Task_2 {
    public static class FrequencyDictionary {

        public static Map<String, Integer> frequencyDictionary(String text) {
            Map<String, Integer> frequencyMap = new HashMap<>();

            // Разделяем текст на слова, используя пробелы и знаки препинания в качестве разделителей
            String[] words = text.split("[\\s.,!?;:]+");

            // Считаем количество вхождений каждого слова
            for (String word : words) {
                // Приводим слово к нижнему регистру, чтобы учитывать его независимо от регистра
                // Обновляем значение в карте: если слово уже есть, увеличиваем счетчик, иначе добавляем в карту
                // V (K key, V value) - функция пересчета нового значения, в качестве аргумента принимает ключ и значение, полученное по этому ключу
                frequencyMap.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue +1);

                // frequencyMap.computeIfPresent(word, (k, v) -> v +1);
                // frequencyMap.computeIfAbsent(word, k -> 1);
            }

            return frequencyMap;
        }
    }

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = FrequencyDictionary.frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
