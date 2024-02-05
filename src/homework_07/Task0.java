package homework_07;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1, 2 или 3: ");

        // Считываем введенное значение
        int userInput = scanner.nextInt();

        // Проверяем введенное значение и выводим соответствующее сообщение
        switch (userInput) {
            case 1:
                System.out.println("Вы ввели число: " + userInput);
                break;
            case 2:
                System.out.println("Вы ввели число: " + userInput);
                break;
            case 3:
                System.out.println("Вы ввели число: " + userInput);
            default:
                System.out.println("Вы ввели другое число: " + userInput);
        }
        scanner.close();

    }
}
