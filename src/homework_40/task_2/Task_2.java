package homework_40.task_2;

import java.util.function.Function;

/*
Создайте цепочку функций, которая сначала удаляет пробелы из строки,
затем преобразует её в верхний регистр, и в конце считает количество символов в измененной строке
 */
public class Task_2 {
    public static void main(String[] args) {
        String input = " Пример строки для трансформации ";

        Function<String, String> removeSpaces = s -> s.replaceAll("\\s+", "");
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, Integer> countCharacters = String::length;

        // Цепочка функций
        Function<String, Integer> transformationChain = removeSpaces.andThen(toUpperCase).andThen(countCharacters);

        int result = transformationChain.apply(input);

        System.out.println("Количество символов после преобразований: " + result);
    }
}
