package lesson_06;

public class StringComparison {
    public static void main(String[] args) {

        // Пул строк // String pool
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("JAVA");

        System.out.println("str1: " + str1);
        System.out.println("str3: " + str3);

        System.out.println(str1 == str2); // сравнение значений переменных (ссылки/String), а в переменной хранятся адреса памяти.
        System.out.println(str1 == str3);

        System.out.println("str1.equals(str2) -> " + str1.equals(str2)); // сравнивает по значениям обьекта.
        System.out.println("str1.equals(str3) -> " + str1.equals(str3)); // сравнивает по значениям обьекта.
        System.out.println("str1.equals(str4) -> " + str1.equals(str4)); // сравнивает по значениям обьекта.

        // Сравнение с игнорированием регистр букв
        System.out.println("str1.equalsIgnoreCase(str4) -> " + str1.equalsIgnoreCase(str4)); // сравнивает по значениям обьекта.

    }
}
