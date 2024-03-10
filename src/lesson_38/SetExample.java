package lesson_38;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        /*
        Контракт между hashCode() и equals()
        1. Если два объекта равны между собой по equals(), то их хеш-коды тоже должны быть равны.
        2. Если хеш-коды двух объектов различны, то эти объекты абсолютно точно не равны по методу equals().
        3. Вызов метода hashCode() должен возвращать одинаковое значение при многократных вызовах на неизменном объекте.
         */

        Set<Integer> integersConstr = new HashSet<>(); // 16 корзин, loadFactor 0.75
        Set<Integer> integersConstr1 = new HashSet<>(28); // 32 корзины (ближайшая степень двойки) задаем значение корзин, loadFactor 0.75
        Set<Integer> integersConstr2 = new HashSet<>(28, 0.80f); // 32 корзины (ближайшая степень двойки) задаем значение корзин, задаем loadFactor 0.80
        Set<Integer> integersConstr3 = new HashSet<>(integersConstr); // Принимает коллекцию. И создает set из уникальных элементов этой коллекции.


        List<Integer> startValues = List.of(15, 1, 2, 3, 3, 5, 6, 8, 8, 15, 7, 0, 16, 32, 64, 33);
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println(integers);

//        Set<Integer> integersSet = new HashSet<>(List.of(7, 6, 9, 33, 10, 15, 17, 1, 5));
//        System.out.println(integersSet);
//
//        Set<String> strings = new HashSet<>(List.of("String", "Java", "Python", "hello"));
//        System.out.println(strings);

        // Сохраняет порядок добавление элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println(linkedSet);

        // add(E e) - добавляет
        System.out.println(integers.add(100)); // true - элемент добавлен, т.к. еще не было значения в set - e.
        System.out.println(integers.add(100)); // false - элемент НЕ добавлен, т.к. уже есть значение в set - e.

        // remove(Object obj)
        System.out.println("integers.remove(100) -> " + integers.remove(100));
        System.out.println("integers.remove(100) №2 -> " + integers.remove(100));

        // boolean contains(Object obj)
        System.out.println("integers.contains(33) -> " + integers.contains(33));

        // size()
        // isEmpty()
        // iterator() - возвращает iterator

        Iterator<Integer> iterator = integers.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        // clear() - удаляет все элементы из set


        Set<Integer> treeSet0 = new TreeSet<>(); // пустое, упорядоченное, сортируемое в естественном порядке множество
        Set<Integer> treeSet1 = new TreeSet<>(integers);
        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        // Set<Integer> treeSet3 = new TreeSet<>(TreeSet<T>); // создает новое множество, содержащее те же элементы в том же порядке

        Set<Integer> treeSet = new TreeSet<>(startValues);
        System.out.println(treeSet);

        Set<Integer> sortedReversed = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        sortedReversed.addAll(startValues);
        sortedReversed.add(11);
        System.out.println("sortedReversed -> " + sortedReversed);

        // Task1
        // Написать метод, который принимает список и возвращает список, состоящий из уникальных элементов

        System.out.println("startValues -> " + startValues);
        List<Integer> uniqueList = getUniqueList(startValues);
        System.out.println("uniqueList -> " + uniqueList);

        // Task2
        // Написать метод, который принимает список и возвращает список, состоящий из уникальных элементов, отсортированный в порядке убывания

        System.out.println("getUniqueSortedList(startValues) -> " + getUniqueSortedList(startValues));



    }

    public static <T> List<T> findUniqueElements(List<T> list) {
        // Создаем HashSet для хранения уникальных элементов
        Set<T> uniqueSet = new HashSet<>(list);

        // Создаем новый список из уникальных элементов
        List<T> uniqueList = new ArrayList<>(uniqueSet);

        return uniqueList;
    }

    public static <T> List<T> getUniqueList(List<T> list) {
        // получу set, состоящий из уникальных элементов списка
        Set<T> uniqueSet = new LinkedHashSet<>(list);

        // Создаем новый список из уникальных элементов
        return new ArrayList<>(uniqueSet);
    }

    public static <T> List<T> getUniqueSortedList(List<T> list) {
        // Получаем уникальные элементы и автоматически сортируем их по возрастанию
        Set<T> uniqueSet = (Set<T>) new TreeSet<>(Comparator.reverseOrder());
        uniqueSet.addAll(list);

        return new ArrayList<>(uniqueSet);
    }
}
