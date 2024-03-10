package homework_37.task_1;

import java.util.ArrayList;
import java.util.List;

/*
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обоих коллекциях.
 */
public class task1 {
    public static void main(String[] args) {
        List<Integer> integers1 = new ArrayList<>(List.of(1, 3, 3, 5, 7, 10, 11));
        List<Integer> integers2 = new ArrayList<>(List.of(0, 3, 7, 7, 6, 12, 15, 0));

        System.out.println("intersection(integers1, integers2) -> " + intersection(integers1, integers2));
        System.out.println("intersection(integers2, integers1) -> " + intersection(integers2, integers1));

    }

    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }

}
