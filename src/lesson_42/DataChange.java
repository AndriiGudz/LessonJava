package lesson_42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataChange {
    public static void main(String[] args) {

        // Промежуточные методы для изменения данных в потоке.

        /*
        map(Function mapper) - преобразует элементы потока с использованием функции мапера
        flatMap(Function<T, R> mapper) - преобразует каждый элемент потока других объектов и затем все эти потоки "склеивает" в один поток
        mapToObj(IntFunction mapper) - преобразует примитивный тип данных в ссылочный при помощи заданной функции
        .boxed() - используется для преобразования примитивных типов данных в соответствующий оберточный класс
        int -> Integer
        char -> Charter
        double -> Double

        mapToInt - получаем поток примитивов
        mapToLong
        mapToDouble

         */

        // task1();
        // task2();
        task3();
        // task4();
    }

    private static void task3() {
        // Получить список всех символов, содержащихся в строках (String) списка
        String[] strings = {"Abcd", "bbbbb", "string", "hello World"};

        // String.chars() -> Intstream - поток примитивов (int), содержащий целочисленные значения кода символа
        List<Character> characterList = Arrays.stream(strings)
                .flatMapToInt(string -> string.chars())
                .peek(e -> System.out.println("e: " + e))
                .mapToObj(i -> (char) i)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(characterList);

    }

    private static void task4() {
        // Я массив int содержащий все дли строк из массива strings
        // int[] arrayInt = {4, 5, 6, 1};
        String[] strings = {"Abcd", "bbbbb", "string", "hello World"};

        int[] lengths = Arrays.stream(strings)
                .mapToInt(String::length)
                .toArray();

        System.out.println(Arrays.toString(lengths));
    }

    private static void task2() {
        // Примитивы в Stream API
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7};
        // Преобразовать массив примитивов int в список Integer

        List<Integer> integerList = Arrays.stream(ints)
                // .mapToObj(i -> i)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(integerList);

        // Получить из списка Integer -> массив примитивов
        // IntStream

        int[] ints1 = integerList.stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println("Массив: " + Arrays.toString(ints1));
    }

    private static void task1() {
        // Получить список всех продуктов, представленных во всех магазинах
        Shop shop = new Shop("Shop 1", List.of("Orange", "Banana", "Apple"));
        Shop shop1 = new Shop("Shop 2", List.of("Lime", "Chery", "Pineapple"));
        Shop shop2 = new Shop("Shop 3", List.of("Grape", "Lemon", "Apple"));

        Shop[] shops = {shop, shop1, shop2};

        List<String> products = Arrays.stream(shops)
                .flatMap(currentShop -> currentShop.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(products);

    }
}
