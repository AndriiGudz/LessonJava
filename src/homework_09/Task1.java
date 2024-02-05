package homework_09;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//        Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
//        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//        Для вычисления суммы с учетом процентов используйте цикл for.
//        Пусть сумма вклада будет представлять тип float.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sumVklad = scanner.nextFloat();
        System.out.println("Введите количество месяцев: ");
        int mount = scanner.nextInt();

        float percent = 7;

        for (int i = 0; i < mount; i++) {
            sumVklad = sumVklad + sumVklad * (percent / 100);
        }
        System.out.printf("Сумма вклада с учетом процентов: %.2f", sumVklad);

    }
}
