package lesson_42;

import java.util.List;
import java.util.Optional;

public class TerminalsMethods {
    public static void main(String[] args) {
        // Терминальные методы

        // Методы, которые возвращают одно значение
        /*
        boolean allMatch(Predicate<T> predicate) - возвращает true, если ВСЕ элементы потока соответствуют предикату
        boolean anyMatch(Predicate<T> predicate) - возвращает true, если ХОТЯ БЫ один элемент соответствует предикату
        boolean noneMatch(Predicate<T> predicate) - возвращает true, если НЕ один элемент в потоке НЕ соответствует предикату

        Optional<T> findFirst() - возвращает первый элемент потока
        Optional<T> findAny() - возвращает произвольный элемент потока

        long count() - возвращает кол-во элементов в потоке
         */

        task1();

    }

    private static void task1() {
        List<Integer> integers = List.of(1, 4, 5, -5, 10, 22, 34, -23);

        // отсеять элементы в потоке, которые меньше 10 и проверить, что в потоке остались только четные числа
        // allMatch
        boolean allMatch = integers.stream()
                .filter(i -> i >= 10)
                .peek(i -> System.out.println("i: " + i))
                .allMatch(i -> i % 2 == 0); // все элементы в потоке четные?

        System.out.println("allMatch: " + allMatch);

        // anyMatch
        boolean anyMatch = integers.stream()
                .filter(i -> i >= 10)
                .peek(i -> System.out.println("i: " + i))
                .anyMatch(i -> i % 2 != 0); // есть хотя бы один нечетный элемент

        System.out.println("anyMatch: " + anyMatch);

        // noneMatch
        boolean noneMatch = integers.stream()
                .filter(i -> i >= 10)
                .peek(i -> System.out.println("i: " + i))
                .noneMatch(i -> i % 2 != 0); // есть хотя бы один нечетный элемент

        System.out.println("noneMatch: " + noneMatch);

        // findFirst
        Optional<Integer> number = integers.stream()
                .filter(i -> i > 20)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println("findFirst i: " + i))
                .findFirst();

        System.out.println("findFirst(): " + number.orElse(null));

        // findAny
        Optional<Integer> number1 = integers.stream()
                .filter(i -> i > 20)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println("findAny i: " + i))
                .findAny();

        System.out.println("findAny(): " + number.orElse(null));

        long size = integers.stream()
                .filter(i -> i < 0)
                .count();

        System.out.println("count: " + size);
    }
}
