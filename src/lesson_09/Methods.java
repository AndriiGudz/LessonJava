package lesson_09;

public class Methods {
    public static void main(String[] args) {

        // Метод - это набор инструкций (оператор).
        // У каждого метода есть имя
        // Чтобы выполнить этот набор инструкций мы вызываем обращаясь к методу по этому имени

        // Программа выводила в консоль 5 раз слово "Hello"

        sayHello();
        System.out.println("==========");
        sayHello();
        System.out.println("==========");
        sayHello();

    } // Конец метода main

    public static void sayHello () {
        System.out.println("Hello");
        System.out.println("Friday");
    }
}
