package homework_11;

import java.io.PrintStream;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//      Написать метод принимающий целое число и проверяющий является ли число простым. Если является,
//      метод должен вернуть true, не является - false

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число: ");
        int number = scanner.nextInt();

        if (numberTesting(number)) {
            System.out.println(number + " - простое число.");
        } else {
            System.out.println(number + " - не является простым числом.");
        }


    }//end

    public static boolean numberTesting(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
