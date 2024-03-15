package lesson_43;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExample {
    public static void main(String[] args) {

        // Ошибка компиляции:
        String str = "Hello";
        // int a = "Java";  // Ошибка компиляции: java: incompatible types: java.lang.String cannot be converted to int

        // System.out.println(1 / 0); // java.lang.ArithmeticException: / by zero
        int[] array = {1, 3, 6};
        // array[10] = 10; // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3

        String str1 = null;
        // str1.length(); // java.lang.NullPointerException


        /*
        Программа продолжит работать дальше если будет поймана ошибка в блоке try!!!
        try {
        // код, который может вызвать исключение
        } catch() {
        // код обработки исключений
        }
         */

        String string = "1";
        int integer = -100;

        // try блок используется для оборачивания кода, который может вызвать исключения.
        // cathc блок - для перехвата и обработки исключения.
        // finally блок - используется для кода, который должен быть выполнен независимо от того, было ли исключение перехвачено.

        try {
            integer = Integer.parseInt(string);
            System.out.println("End try block");

            String str5 = null;
            System.out.println(str5.length());

        } catch (NullPointerException nullPointerException) {
            System.out.println("Я ловлю NPE!!!");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            // exception.printStackTrace(); // вывод красной ошибки в терминале
            integer = 0;
        } finally {
            System.out.println("Код из блока finally");
        }

        System.out.println("Программа работает дальше\n");
        System.out.println("integer: " + integer);

        System.out.println("\n===========================\n");

        String url = getUrlString();
        System.out.println(url);

        try {
            String url2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат адреса");
            System.out.println(e.toString());
            // throw new RuntimeException(e); // вывод красной ошибки в терминале
        }

    }

    private static String getUrlString() {
        URL myUrl = null;
        String defaultUrlString = "https://google.com";

        try {
            myUrl = new URL(defaultUrlString);
            myUrl = new URL("htps://example.com");
        } catch (MalformedURLException exception) {
            System.out.println("Неверный формат URL: " + exception.getMessage());
        }

        return myUrl.toString();
    }

    private static String getUrlString2() throws MalformedURLException {
        // Ключевое слово throws - используется в сигнатуре метода для указания,
        // что метод может выбросить исключение

        URL myUrl = new URL("htps://example.com");

        return myUrl.toString();
    }
}
