package homework_40.task_1;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
Используйте несколько предикатов для фильтрации списка чисел, где числа должны быть четными,
больше 10 и меньше 100.
 */
public class Task_1 {
    public static List<Integer> filterNumbers(List<Integer> numbers) {
        // Предикаты для фильтрации чисел
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan10 = n -> n > 10;
        Predicate<Integer> isLessThan100 = n -> n < 100;

        // Комбинированный предикат
        Predicate<Integer> combinedPredicate = isEven.and(isGreaterThan10).and(isLessThan100);

        // Применяем предикаты для фильтрации списка чисел
        return numbers.stream()
                .filter(combinedPredicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 20, 35, 45, 50, 65, 75, 80, 95, 100);

        List<Integer> filteredNumbers = filterNumbers(numbers);
        System.out.println("Filtered numbers: " + filteredNumbers);
    }

}
