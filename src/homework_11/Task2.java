package homework_11;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
//        Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве.
//        Для проверки на "простоту" числа рекомендуется использовать метод из Task 1

        int size = 20;
        int[] array = new int[size];

        numberTesting(array);


    }// End

    public static void numberTesting(int[] sortArray) {
        Random random = new Random();
        int count = 0;
        System.out.print("[");
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = random.nextInt(101);
            System.out.print(sortArray[i] + ((i < sortArray.length - 1) ? ", " : "]\n"));
        }
        System.out.println("");
        for (int i = 0; i < sortArray.length; i++) {
            int number = sortArray[i];
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Простое число: " + number);
                count++;
            }
        }
        System.out.println("Всего простых чисел: " + count);
    }
}