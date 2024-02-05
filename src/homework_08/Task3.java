package homework_08;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int size = random.nextInt(15)+1;
        System.out.println("size: " + size);

        int[] array = new int[size];

        int i = 0;
        System.out.print("[");
        while (i < array.length){
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ((i < array.length - 1) ? "; " : ""));
            i++;
        }
        System.out.println("]");

        int min = array[0];
        int max = array[0];

        int sum = 0;

        i =0;
        while (i < array.length){
            sum += array[i];

            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
            i++;
        }
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Среднее значение: " + ((double) sum / array.length));
    }
}
