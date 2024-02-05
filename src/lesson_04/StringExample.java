package lesson_04;

public class StringExample {
    public static void main(String[] args) {

        String name = "Andrey"; // обьявление и инициализация переменной типа String

        String name2 = new String("Hallo"); // создание строки с помощью класса

        // длина строки
        name.length(); // получаем длину нашей строки
        System.out.println(name.length());
        int lenght = name.length(); // поговорим позже, когда будем говорить о методах
        System.out.println(lenght);

        // привести все символы в строке к верхнему регистру
        System.out.println(name.toUpperCase());
        System.out.println(name);

        // привести все символы в строке к нижнему регистру
        System.out.println(name);
        System.out.println(name.toLowerCase());

    }
}
