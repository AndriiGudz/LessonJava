package homework_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int unserNummer = scanner.nextInt();
        if (unserNummer < 0) {
            unserNummer *= -1;
        }

        int sum = 0;
        // 12345 ->

        while (unserNummer > 0) {
            int currentDigit = unserNummer % 10;
            System.out.print(currentDigit + ((unserNummer > 10) ? " + " : " = "));
            sum += currentDigit;
            unserNummer = unserNummer / 10;
        }
        System.out.println(sum);

    }
}
