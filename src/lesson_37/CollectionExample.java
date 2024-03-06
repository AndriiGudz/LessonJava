package lesson_37;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Методы интерфейса Collection
        // Все эти методы гарантированно есть во всех коллекциях (кроме Мар)

        // boolean add(E e) -> добавляет элемент в коллекцию
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Список до вставки: " + list);

        list.add(2, 100); // добавляет элемент в индекс 2
        System.out.println("Список после вставки: " + list);

        // int size() -> количество элементов в коллекцию.
        System.out.println("list.size() -> " + list.size());

        // boolean remove(Object obj) - удаляет элемент из коллекции по значению.
        // T remove(int index) - удаляет по индексу
        list.remove(Integer.valueOf(100));
        System.out.println("list.remove(0) -> " + list.remove(0));
        System.out.println(list);

        // boolean isEmpty() - возвращает true, если коллекция пустая (нет элементов)
        System.out.println("list.isEmpty() -> " + list.isEmpty());

        // boolean contains(Object obj) - возвращает true если коллекция содержит такой элемент
        System.out.println("list.contains(100) -> " + list.contains(100));

        System.out.println("==========================================");
        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(6);
        listA.add(7);
        listA.add(8);

        System.out.println(list);
        System.out.println(listA);

        // boolean addAll(Collection<? extend T> c) - добавляет все элементы из коллекции в коллекцию, у которой был вызван метод
        listA.addAll(listA);

        System.out.println(list);

        // boolean addAll(int index, Collection<? extend T> c) - добавляет все элементы из коллекции в коллекцию, у которой был вызван метод. Вставка элементов с индексом.
        System.out.println("list.addAll(1, listA) -> " + list.addAll(1, listA));
        System.out.println(list);

        // boolean containsAll(collection c) - возвращает true, если коллекция содержит все элементы из указанной коллекции.
        List<Integer> listB = new ArrayList<>();
        listB.add(8);
        listB.add(7);
        listB.add(2);
        System.out.println("listB -> " + listB);

        System.out.println("list.containsAll(listB) -> " + list.containsAll(listB));

        System.out.println("\n==========================================\n");

        // boolean removeAll(Collection c) - удаляет все элементы из текущей коллекции, которые содержаться в указанной коллекции.
        System.out.println("list -> " + list);
        listB.add(0);
        System.out.println("listB -> " + listB);
        System.out.println("list.removeAll(listB) -> " + list.removeAll(listB));
        System.out.println("list -> " + list);

        System.out.println("\n==========================================\n");
        System.out.println("list -> " + list);
        System.out.println("listA -> " + listA);

        // boolean retainAll(collection c) - оставляет в текущей коллекции ТОЛЬКО те элементы, которые содержаться в указанной коллекции. Остаются только пересекающиеся значения.
        System.out.println("list.retainAll(listA) -> " + list.retainAll(listA));
        System.out.println(list);

        // list.clear - удаляет все элементы из коллекции
        listA.clear();
        System.out.println(listA);
        System.out.println(listA.size());
        System.out.println(listA.isEmpty());

        // Object[] toArray()
        // T[] toArray(T[] array)
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        // removeIf(Predicate<T> pr) - позволяет удалить все элементы из коллекции, удовлетворяющие условию предиката.
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);



    }
}
