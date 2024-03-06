package homework_36.task_1;

import java.util.Arrays;
import java.util.Comparator;
/*
Task 1
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки
массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами

Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
 */
public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer var1, Integer var2) {
        // Если оба числа четные или оба нечетные, сортируем по возрастанию
        if (var1 % 2 == var2 % 2) {
            return var1.compareTo(var2);
        }
        // Если var1 четное, а var2 нечетное, то var1 идет перед var2
        else if (var1 % 2 == 0 && var2 % 2 != 0) {
            return -1;
        }
        // Если var1 нечетное, а var2 четное, то var1 идет после var2
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, new MyComparator());
        System.out.println(Arrays.toString(integers));
    }

}
