package lesson_42.groupBy;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        // Методы для группировки данных в Мар

        // Collectors.groupingBy(Function classifier)
        // Группирует элементы потока по ключу, полученному с помощью функции-классификатора
        // Результат: Map<K, List<T>>

        // group();
        group1();
    }

    private static void group1() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 22, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 25, "chef", "Management"),
                new Employee("Hanna", 1300, 25, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

        Map<String, List<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("getDepartment: " + map1);

        Map<String, Set<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));

        System.out.println("Collectors.toSet(): " + map);

        // Количество сотрудников в каждом отделе
        Map<String, Long> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Collectors.counting():\nКоличество сотрудников в каждом отделе: " + map2);

        // расчет средней зарплаты в отделе
        Map<String, Double> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Средняя зарплата\n" + map3);

        // Группировка по отделам с получением списка зарплат
        Map<String, List<Integer>> map4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.toList())));

        System.out.println("Группировка по отделам с получением списка зарплат\n" + map4);

        // Суммарная статистика
        IntSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getSalary));

        System.out.println("Суммарная статистика:\n" + statistics);
        System.out.println("Статистика average:\n" + statistics.getAverage());

    }

    private static void group() {
        List<Integer> integers = List.of(1, 2, 3, 105, 4, 5, 6, 7, 0, 200, 150);

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "Even" : "Odd"));

        System.out.println(map);
        System.out.println(map.keySet());

        Map<String, List<Integer>> map1 = integers.stream()
                .collect(Collectors.groupingBy(i -> {
                    if (i == 0) return "Zero";
                    if (i > 100) return "GreatNumbers";
                    if (i % 2 == 0) {
                        return "Even";
                    } else {
                        return "Odd";
                    }
                }));

        System.out.println(map1);

    }
}
