package lesson_09;

import java.util.Random;

public class Zadacha1 {
    public static void main(String[] args) {

        // random.nextInt(11) (0...10)+5
        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];
        System.out.println("Размер массива: " + ints.length);

        System.out.print("[");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // (0...100) - 50 -> -50 ... 50
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }

    }
}
