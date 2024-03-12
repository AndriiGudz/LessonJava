package lesson_40;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Stream API

        // Stream - поток данных

        // Промежуточные методы
        /*
        filter(Predicate<T>) - отфильтровывает элементы, соответствующие данному предикату.
        sorted() - сортирует элементы
        map(Function <T,R> mapper) - преобразует элементы пока с использованием функции мапера.
        peek(Consumer <T> action) - выполняет действие для каждого элемента потока.

        Терминальные методы:
        R collect(Collector<T, A, R> collector) - преобразует поток в какую-то структуру данных (например в коллекцию)

         */

        // task1();
        // task2();
        // task3();
        // task4();
        task5();



    } // main

    private static void task5() {
        // Получить список имен кошек, чей вес больше 4
        List<Cat> cats = getListCat();

        List<String> catName = cats
                .stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(catName);
    }

    private static void task4() {
        // получить список имен всех кошечек
        List<Cat> cats = getListCat();

        Stream<String> stringStream = cats
                .stream()
                .map(cat -> cat.getName());

        List<String> catName = cats.stream() // создаем поток
                .map(Cat::getName)  // преобразуем Stream<Cat> -> Stream<String>
                .collect(Collectors.toList()); // собираем в список

        System.out.println(catName);
    }

    private static void task3() {
        List<Cat> cats = getListCat();

        // фильтрация по длине имени.
        // Список котов, чье имя длиннее 4 символов.

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // пока не запущен терминальный метод, промежуточные методы не выполняются
        // Lazy Evaluation
        List<Cat> catList = catStream.collect(Collectors.toList());

        System.out.println("End task3 method");
    }

    private static void task2() {
        List<Cat> cats = getListCat();

        // список кошек, чей вес больше 4 кг

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод закрывает поток.
        List<Cat> fatCats = catStream.collect(Collectors.toList());
        // повторно использовать "закрытый" поток нельзя.

        System.out.println(fatCats);
    }

    private static List<Cat> getListCat() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 0);
        // список, положительных чисел
        // список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer intg : integers) {
            if (intg > 0) result.add(intg);
        }
        // Collections.sort(result);
        // System.out.println(result);

        // У всех коллекций, есть метод stream() - создающий поток на основе элементов коллекции.

        List<Integer> resultStream = integers.stream() // создают поток на основе коллекции.
                .filter(integer -> integer > 0) // фильтрация элементов
                .sorted() // сортировка в естественном порядке
                .collect(Collectors.toList()); // преобразует элементы потока в список (в коллекцию).

        System.out.println(resultStream);

    }

}
