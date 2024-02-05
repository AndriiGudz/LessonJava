package homework_06;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();

        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);

        System.out.println("Число 1: " + var1);
        System.out.println("Число 2: " + var2);
        System.out.println("Число 3: " + var3);
        System.out.println("Число 4: " + var4);

        // Определяем максимальное из четырех чисел
        int maxNumber = Math.max(Math.max(var1, var2), Math.max(var3, var4));

        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("======================================");

        int max = var1;

        if (max < var2){
            max = var2;
        } if (max < var3){
            max = var3;
            if (max < var4){
                max = var4;
            }
        }

        System.out.println("Максимальное число: " + maxNumber);


        System.out.println("======================================");
        if (max < var2) max = var2;
        if (max < var3) max = var3;
        if (max < var4) max = var4;

        System.out.println("Максимальное число: " + maxNumber);

    }
}
