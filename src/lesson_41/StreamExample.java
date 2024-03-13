package lesson_41;

import java.util.*;
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
        void forEach(Consumer<T> action) - выполняет заданное действие для заданного элемента потока
        min(Comparator<T> comparator) - возвращает минимальное значение
        max(Comparator<T> comparator) - возвращает максимальное значение

         */

        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        // taskOptional();
        // task9();
        // task10();
        // task11();
        task12();



    } // main

    private static void task12() {
        // Получить список котов, вес которых больше 4

        Cat[] arrayCats = {
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat(null, 3, "gray"),
                new Cat("Panda", 4, "black"),
                null
        };

        List<Cat> catList = Arrays.stream(arrayCats)
                .filter(cat -> Objects.nonNull(cat)) // отфильтровать null из потока - проверка на null
                .filter(cat -> cat.getWeight() > 4)
                .collect(Collectors.toList());

        System.out.println(catList);

        // отфильтровать поток - убрать всех котов, у которых имя null
        List<Cat> notNullNameCats = Arrays.stream(arrayCats)
                .filter(Objects::nonNull)
                .filter(cat -> Objects.nonNull(cat.getName()))
                .collect(Collectors.toList());

        System.out.println(notNullNameCats);
    }

    private static void task11() {
        // Список всех положительных, четных чисел
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1);

        List<Integer> positiveEvenNumbers = integers.stream()
                .filter(number -> number > 0)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Список всех положительных, четных чисел:\n" + positiveEvenNumbers);

    }

    private static void task10() {
        // Найти и вывести в консоль самое длинное имя у кота из списка
        List<Cat> cats = getListCat();
        Optional<String> longCatName = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparingInt(String::length));

        // Вывести самое длинное имя кота, если оно найдено
        longCatName.ifPresent(name -> System.out.println("Самое длинное имя кота: " + name));

    }

    private static void task9() {
        // распечатать min и max списка чисел
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1);

        Optional<Integer> optMax = integers.stream().max(Integer::compareTo);
        Optional<Integer> optMin = integers.stream().min(Integer::compareTo);

        if (optMax.isPresent()) {
            System.out.println("Max: " + optMax.get());
        } else {
            System.out.println("Max не найден");
        }

        System.out.println("Min: " + optMin.orElseGet(() -> getDefaultValue()));


    }

    private static Integer getDefaultValue() {
        return null;
    }

    private static void taskOptional() {
        // Найти минимальное значение в списке чисел
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1);

        // integers.stream().minOptional(Integer::compareTo);
        Optional<Integer> minOptional = integers.stream().min(Integer::compareTo);

        minOptional = Optional.ofNullable(null);

        System.out.println("minOptional.isEmpty() -> " + minOptional.isEmpty()); // пустой или нет
        System.out.println("minOptional.isPresent() -> " + minOptional.isPresent()); // значения пресутствуют

        Integer min;
        if (minOptional.isPresent()) {
            min = minOptional.get();
        } else {
            // возвращает значение, если оно присутствует. Иначе возвращает значение по умолчанию
            min = minOptional.orElse(-100);
        }

        System.out.println(min);

        // Создание Optional
        Optional.empty(); // возвращает пустой Optional
        Optional.of(100); // возвращает Optional со значением
        Optional.ofNullable(null); // возвращает Optional со значением или пустой

    }

    private static Integer getMax(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) return null;

        Integer max = integers.get(0);
        for (Integer i : integers) {
            if (i > max) max = i;
        }
        return max;
    }

    private static void task8() {
        // Изменить имя котов, вес которых меньше 5.
        // Распечатать элементы потока.
        List<Cat> cats = getListCat();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5) // фильтруем поток
                .peek(cat -> cat.setName("Slim " + cat.getName())); // промежуточный метод, который завершает какое-то действие с каждым элементом потока

        catStream.forEach(cat -> System.out.println(cat)); // терминальный метод, который завершает какое-то действие с каждым элементом потока

        System.out.println("cats: " + cats);

    }

    private static void task7() {

        // Stream API и исключения
        // Если в каком-то промежуточном методе возникает исключительная ситуация,
        // то обработать ее и словить, можем только в терминальном методе с помощью специальной обертки отладки (а не в методе, который вызвал исключение).
        Cat[] arrayCats = {
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat(null, 3, "gray"),
                new Cat("Panda", 4, "black")
        };

        // Создание потока из массива
        Stream<Cat> stream = Arrays.stream(arrayCats);

        stream = stream.filter(cat -> cat.getName().length() > 4);

        try {
        List<Cat> catList = stream.collect(Collectors.toList());
            System.out.println("Method try");
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }

        System.out.println("End method");
    }

    private static void task6() {
        // Получить список имен кошек, которые короче 5 символов

        List<Cat> cats = getListCat();

        List<String> names = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println(names);

        List<String> strings = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(names);
    }

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
