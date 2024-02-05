package homework_07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7:");

        // Считываем введенное значение
        int userInput = scanner.nextInt();

        // Проверяем введенное значение и выводим соответствующее сообщение
        switch (userInput) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Вы ввели не верное значение: " + userInput);
        }
        scanner.close();

    }
}
