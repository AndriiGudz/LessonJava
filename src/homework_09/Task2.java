package homework_09;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
//        Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести
//        на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.
//        Простое число - число, которое делится на цело только на 1 и само себя.
//        Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
        Random random = new Random();
        int[] array = new int[50];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + ((i < array.length - 1) ? " | " : ""));
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            boolean isPrime = true;
            if (number <= 1){
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.println("Простое число: " + number);
                count++;
            }
        }
        System.out.println("Всего простых чисел: " + count);

    }


}