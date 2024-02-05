package homework_09;

import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
//        Заполните массив 20 случайными целыми числами.
//        Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.

        Random random = new Random();
        int[] massiv20 = new int[20];

        int i = 0;
        System.out.print("[");
        while (i < massiv20.length) {
            massiv20[i] = random.nextInt(101);
            System.out.print(massiv20[i] + ((i < massiv20.length - 1) ? " | " : ""));
            i++;
        }
        System.out.println("]");

        int quantityEven = 0;
        int sum = 0;

        i = 0;
        while (i < massiv20.length) {
            if (massiv20[i] % 2 == 0) {
                System.out.print(massiv20[i] + ((i < massiv20.length - 1) ? " | " : ""));
                quantityEven++;
                sum += massiv20[i];
            }
            i++;
        }
        System.out.println("\nКоличесто четных чисел: " + quantityEven);
        System.out.println("Сумма четных чисел: " + sum);

    }
}
