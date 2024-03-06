package lesson_37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {


        /*
        Конструкторы класса ArrayList
        ArrayList(); - Создает пустой список. (Размер внутреннего массива равен = 10)
        ArrayList(int capacity); - Пустой список, но внутренний массив будет иметь размер capacity.
        ArrayList(Collection<? extends T> col) - Создает список, содержащий элементы указанной коллекции,
        в том порядке, в котором они возвращаются Итератором коллекции.
         */

        // Метод of - статический метод, который представлен в нескольких интерфейсах JCF, начиная с JDK 9.
        // Эти методы предназначены для создания неизменяемых коллекций.
        // List, Set, Map

        List<Integer> integers = List.of(1, 2, 3, 4, 5); // НЕ изменяемая коллекция.
        System.out.println(integers);
        // integers.remove(2); // нельзя реализовать, так как не изменяемая

        List<String> strings = new ArrayList<>(List.of("Str1", "Str2", "Str3", "Str4"));
        System.out.println(strings);

        strings.addAll(List.of("String hello", "Java", "Java", "Python")); // null добавлять нельзя - поломается
        System.out.println(strings);

        // add(E)
        // add(unt index, E element)

        // get(int index) - взятие элемента по индексу
        System.out.println(strings.get(3));

        // int indexOf(Object obj)
        // int lastIndexOf(Object obj)

        System.out.println("indexOf(Java) -> " + strings.indexOf("Java"));
        System.out.println("lastIndexOf(Java) -> " + strings.lastIndexOf("Java"));

        // sort(Comparator<? super T> comparator)
        strings.sort(Comparator.comparing(String::length));
        System.out.println(strings);

        // List<T> subList(int from, int to) - возвращает вид на часть списка, начиная с индекса from до (to -1)
        List<String> subList = strings.subList(1, 4);
        System.out.println(subList);

    }
}
