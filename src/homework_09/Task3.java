package homework_09;

public class Task3 {
    public static void main(String[] args) {
//        Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида.

        int n = 6; // Количество строк

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
