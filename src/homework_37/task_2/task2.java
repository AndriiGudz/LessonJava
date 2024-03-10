package homework_37.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */
public class task2 {
        private static final int CAPACITY = 5000;
        private static final int BOUND = 1000;
        private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>(CAPACITY);
        List<Integer> listB = new LinkedList<>();

        for (int i = 0; i < CAPACITY; i++) {
            int randomValue = RANDOM.nextInt(BOUND);
            listA.add(randomValue);
            listB.add(randomValue);
        }

        System.out.println("\n=====================ArrayList===================\n");
        long totalDuration = 0;

        long duration1 = getAllValuesByIndex(listA);
        totalDuration += duration1;
        System.out.println("getAllValuesByIndex(listA) -> " + duration1);

        long duration2 = insertValuesByIndex(listA);
        totalDuration += duration2;
        System.out.println("insertValuesByIndex(listA) -> " + duration2);

        long duration3 = deleteValuesByIndex(listA);
        totalDuration += duration3;
        System.out.println("deleteValuesByIndex(listA) -> " + duration3);

        System.out.println("Общее время: " + totalDuration);



        System.out.println("\n=====================LinkedList===================\n");
        totalDuration = 0;

        duration1 = getAllValuesByIndex(listB);
        totalDuration += duration1;
        System.out.println("getAllValuesByIndex(listA) -> " + duration1);

        duration2 = insertValuesByIndex(listB);
        totalDuration += duration2;
        System.out.println("insertValuesByIndex(listA) -> " + duration2);

        duration3 = deleteValuesByIndex(listB);
        totalDuration += duration3;
        System.out.println("deleteValuesByIndex(listA) -> " + duration3);

        System.out.println("Общее время: " + totalDuration);



    }

    // В первом методе - получение всех значений элементов списка по его индексу
    public static long getAllValuesByIndex(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    // Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    public static long insertValuesByIndex(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 2000; i++) {
            list.add(RANDOM.nextInt(list.size()), RANDOM.nextInt(BOUND));
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    // Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    public static long deleteValuesByIndex(List<Integer> list) {
        int amount = 1000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            list.remove(RANDOM.nextInt(list.size()));
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

//    public static long deleteByValue(List<Integer> list) {
//
//    }

}
