package lesson_08;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        //Обьявление массива
        int[] array;
        int numbers[]; //альтернативный способ - НЕ рекоммендуемый

        //Инициализация массива
        array = new int[5]; // создается массив в памяти как обьект.
        // !!! При инициализации мы обязаны указать размер массива.
        // 5 - размер массива (количество ячеек)

        String[] strings = new String[7]; // Обьявление и инициализация массива.
        // Мы создали переменную, которая будет хранить ссылку на массив строк (в Stak).
        // Мы создали обьект в памяти (в Heap).
        // Каждую ячеечку массива мы заполнили значение "по умолчанию"

        // Значения по умолчанию:
        // для всех числовых типов (в том числе char) это будет 0 (0.0)
        // для boolean - false
        // для всех ссылочных типов - значение null (null - ничего)

        // Явная инициализация массива:
        int[] digits = new int[]{56, -98, 14, 1004, 1443};
        String[] strings1 = {"Str", "hello", "Java", "JS", "Orange"};

        // Доступ к значениям в ячейках массива осуществляется по индексам:

        int value = digits[0]; //в переменную было записанно значение ячейки с индексом (номером) 0.

        System.out.println("value: " + value);

        System.out.println("В ячейке под номером 2 в массиве strings1 храняться: " + strings1[2]);
        System.out.println("В ячейке под номером 2 в массиве strings1 храняться: " + strings1[2].toUpperCase());

        System.out.println("В ячейке под номером 3 в массиве digits храняться: " + digits[3]);
        System.out.println("Проведем сразу операции: " + (digits[3] / 2 - 15));

        System.out.println(digits); //так выведется адрес ссылки

        // размер массива
        int arrayLength = digits.length;
        int i = 0;
        while (i < arrayLength) {
            System.out.print(digits[i] + ", ");
            i++;
        }
        System.out.println();

        // Изменение значения в ячейке массива
        digits[2] = 5000;
        i = 0;
        while (i < digits.length) {
            System.out.print(digits[i] + ", ");
            i++;
        }
        System.out.println();


        System.out.println(array[2]); //проверяем значения в ячейках, массивом, заполненых значениями по умолчанию
        System.out.println(strings[5]); //попытка вызова у null каких-либо методов вызовет исключение (аварийное завершение программы)

        strings[5] = "Paskal"; //изменяем значение в ячейке с индексом 5
        System.out.println(strings[5]);


        // Создайте массив из 10 элементов и заполните его случайными числами (0...100)
        System.out.println("===================================");

        Random random = new Random();
//        int rand = random.nextInt(101);

        int[] nums = new int[10];

        int k = 0;
        System.out.print(" [ ");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.print(" ] ");

        k = 1;
        int min = nums[0];
        while (k < nums.length) {
            if (nums[k] < min) {
                min = nums[k];
            }
            k++;
        }
        System.out.println("min: " + min);
    }
}
