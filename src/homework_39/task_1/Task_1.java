package homework_39.task_1;

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

 */
public class Task_1 {
    public static class FrequencyDictionary {

        public static Map<String, Integer> frequencyDictionary(String text) {
            Map<String, Integer> frequencyMap = new HashMap<>();

            // Разделяем текст на слова, используя пробелы и знаки препинания в качестве разделителей
            String[] words = text.split("[\\s.,!?;:]+");

            // Считаем количество вхождений каждого слова
            for (String word : words) {
                // Приводим слово к нижнему регистру, чтобы учитывать его независимо от регистра
                String lowercaseWord = word.toLowerCase();
                // Обновляем значение в карте: если слово уже есть, увеличиваем счетчик, иначе добавляем в карту
                frequencyMap.put(lowercaseWord, frequencyMap.getOrDefault(lowercaseWord, 0) + 1);
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
