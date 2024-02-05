package lesson_06;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // говорим что нам нужен сканер для чтения из консоли
        scanner.useLocale(Locale.US); // Меняем локализацию нашего сканера. Разделителем будет "."
        scanner.useLocale(Locale.GERMANY); // Меняем локализацию нашего сканера. Разделителем будет ","

        System.out.println("Введите ваше имя: ");  // приглашение к вводу данных
        String name = scanner.nextLine(); // Читает строку ввода, включая пробелы до символа перевода каретки (до нажатой кнопки Enter)

        System.out.println("Введите ваш возраст: ");  // приглашение к вводу данных
        int age = scanner.nextInt(); // считывает числовые значения
        scanner.nextInt(); // повтор необходим для корректной работы с цифравыми значениями

        System.out.println("Введите число с запятой: ");  // приглашение к вводу данных
        double dbl = scanner.nextDouble(); // считывает числовые значения с плавующей точкой

        System.out.println("Получили имя: " + name);
        System.out.println("Получили возраст: " + age);
        System.out.println("Получили ДАБЛ: " + dbl);


    }
}
