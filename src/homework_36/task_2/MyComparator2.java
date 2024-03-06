package homework_36.task_2;

import java.util.Arrays;
import java.util.Comparator;

/*
Task 2
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания

Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
 */
public class MyComparator2 implements Comparator<Integer> {

    @Override
    public int compare(Integer var1, Integer var2) {
        // Если оба числа четные или оба нечетные
        if (var1 % 2 == var2 % 2) {
            // Если оба числа четные, сравниваем их по возрастанию
            if (var1 % 2 == 0) {
                return var1.compareTo(var2);
            }
            // Если оба числа нечетные, сравниваем их по убыванию
            else {
                return var2.compareTo(var1);
            }
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
        Arrays.sort(integers, new MyComparator2());
        System.out.println(Arrays.toString(integers));
    }

}
